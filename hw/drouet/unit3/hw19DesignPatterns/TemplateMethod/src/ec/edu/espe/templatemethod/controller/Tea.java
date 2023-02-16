package ec.edu.espe.templatemethod.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Jonathan Jaguaco, Pythons, DCCO-ESPE
 */
public class Tea extends CaffeineBeverage {

    @Override
    public void brew() {
        System.out.println("Steep the tea...");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding Lemon...");

    }

    @Override
    public boolean wantsCondiments() {
        // a hook operation
        String answer = getUserInput();
        if (answer.toLowerCase().startsWith("y")) {
            return true;
        } else {
            return false;
        }
    }

    private String getUserInput() {
        String answer = null;
        System.out.println("Would you like lemon with your tea (y/n) ?");
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            answer = in.readLine();
        } catch (IOException e) {
            System.out.println("Error reading user input: " + e.getMessage());

        }

        return answer;
    }
}
