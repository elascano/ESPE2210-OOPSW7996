
package ec.edu.espe.FactoryMethod.model;

/**
 *
 * @author Yorman Oña, GiftSoft Team, DCCO-ESPE
 */
public class FactoryMethodExample {
    public static void main(String[] args) {
        Animal dog = AnimalFactory.getAnimal("dog");
        dog.speak();

        Animal cat = AnimalFactory.getAnimal("cat");
        cat.speak();
    }
}
