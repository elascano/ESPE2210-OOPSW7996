package ec.edu.espe.LSP.model;
/**
 *
 * @author Alejandro Cuadrado, DCCO-ESPE
 */
class Duck extends FlyingBird {
    @Override
    void eat() {
        System.out.println("Eating");
    }
    void fly(){
        System.out.println("Flying");
    }
}

