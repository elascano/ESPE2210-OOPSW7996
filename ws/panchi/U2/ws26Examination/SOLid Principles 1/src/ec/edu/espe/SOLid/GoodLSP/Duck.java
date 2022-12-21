package ec.edu.espe.SOLid.GoodLSP;

/**
 *
 * @author Allan Panchi, GiftSoft Team, DCCO-ESPE
 */
public class Duck extends FlyingBird{
    
    @Override
    void fly() {
        System.out.println("Flying");
    }

    void eat() {
        System.out.println("Eating");
    }
}
