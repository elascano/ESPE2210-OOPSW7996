package ec.edu.espe.snippedPrototype.view;

import ec.edu.espe.snippedPrototype.model.Car;

/**
 *
 * @author Leonardo Yaranga,Progress Team, DCCO-ESPE
 */
public class GptSnippetPrototype {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Car prototype = new Car("Toyota", "Camry", 2020);
        Car copy1 = (Car) prototype.clone();
        Car copy2 = (Car) prototype.clone();
        System.out.println(copy1.getMake()); // prints "Toyota"
        System.out.println(copy2.getYear()); // prints 2020
    }

}
