package ec.edu.espe.memento.view;

import ec.edu.espe.memento.model.Memento;
import ec.edu.espe.memento.model.Originator;

/**
 *
 * @author Sheylee Enriquez, Developer Bears, DCCO-ESPE
 */
public class Client {

    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState("State 1");
        Memento memento = originator.save();

        originator.setState("State 2");
        System.out.println("Current state: " + originator.getState());

        originator.restore(memento);
        System.out.println("Restored state: " + originator.getState());
    }
}