package ec.edu.espe.TemplateMethod.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Coffee extends CaffeineBeverage {

    @Override
    public void brew() {
        System.out.println("Dripping coffee through filter");

    }

    @Override
    public void addCondiments() {
        System.out.println("Adding sugar and milk");
    }

    @Override
    public boolean wantsCodiments() {
        String answer = getUserInput();
        if (answer.toLowerCase().startsWith("y")) {
            return true;
        } else {
            return false;
        }
    }

    private String getUserInput() {
        String answer = null;
        System.out.print("Would you like milk and sugar with your coffee (y/n)?\t");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            answer = in.readLine();
        } catch (IOException ex) {
            Logger.getLogger(Tea.class.getName()).log(Level.SEVERE, null, ex);

        }
        return answer;
    }

}
