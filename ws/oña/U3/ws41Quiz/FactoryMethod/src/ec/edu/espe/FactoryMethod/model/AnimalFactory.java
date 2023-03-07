
package ec.edu.espe.FactoryMethod.model;

/**
 *
 * @author Yorman Oña, GiftSoft Team, DCCO-ESPE
 */
class AnimalFactory {
    public static Animal getAnimal(String type) {
        switch (type) {
            case "dog":
                return new Dog();
            case "cat":
                return new Cat();
            default:
                throw new IllegalArgumentException("Invalid animal type");
        }
    }
}
