package LSP.good;

/**
 *
 * @author Alexander Guaman, Developer Bears, DCCO-ESPE
 */
public class LSP {

    public static void main(String[] args) {
        Bird ostrich = new Ostrich();
        Duck duck = new Duck();
        ostrich.eat();
        duck.eat();
        duck.fly();
    }
}
