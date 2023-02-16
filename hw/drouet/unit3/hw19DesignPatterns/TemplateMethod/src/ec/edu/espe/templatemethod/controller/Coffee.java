package ec.edu.espe.templatemethod.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Jonathan Jaguaco, Pythons, DCCO-ESPE
 */
public class Coffee extends CaffeineBeverage {

    @Override
    public void brew() {
        System.out.println("Dripping coffee through filter...");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding sugar and milk...");
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
        System.out.println("Would you like milk and sugar with your coffee (y/n) ?");

        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            answer = in.readLine();
        } catch (IOException e) {
            System.out.println("Error reading user input: " + e.getMessage());
        }
        return answer;
    }
}
