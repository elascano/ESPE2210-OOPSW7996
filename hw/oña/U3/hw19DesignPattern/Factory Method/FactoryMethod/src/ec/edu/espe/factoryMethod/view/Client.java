
package ec.edu.espe.factoryMethod.view;

import ec.edu.espe.factoryMethod.controller.Connection;
import ec.edu.espe.factoryMethod.model.Factory;
import ec.edu.espe.factoryMethod.model.FactoryOne;

/**
 *
 * @author Yorman Oña, GiftSoft Team, DCCO-ESPE
 */
public class Client {
    public static void main(String[] args) {
        Factory factory;
        factory = new FactoryOne();
        Connection connection = factory.createConnection("Oracle"); // Factory method
        System.out.println("You are connecting with " + connection.description());
    }
}