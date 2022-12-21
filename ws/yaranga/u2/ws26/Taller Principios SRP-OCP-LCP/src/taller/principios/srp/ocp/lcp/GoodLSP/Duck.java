
package taller.principios.srp.ocp.lcp.GoodLSP;

/**
 *
 * @author Leonardo Yaranga,Progress Team, DCCO-ESPE
 */
public class Duck extends FlyingBird {

    @Override
    void fly() {
        System.out.println("Flying");
    }

    void eat() {
        System.out.println("Eating");
    }
}
