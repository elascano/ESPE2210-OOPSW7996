
package ec.edu.espe.singleton.model;

import ec.edu.espe.singleton.view.Singleton;

/**
 *
 * @author Jerly Reinoso, Search Engine Bandits, DCCO-ESPE
 */
public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.printMessage("This is the first message.");
        
        Singleton anotherSingleton = Singleton.getInstance();
        anotherSingleton.printMessage("This is the second message.");
        
        if (singleton == anotherSingleton) {
            System.out.println("Both instances are the same!");
        }
    }
}

