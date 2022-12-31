
package lsp.model;

/**
 *
 * @author Matias Suarez,WebMasterTeam,DCCO-ESPE
 */
public class Duck extends FlyingBird {

    @Override
    public void eat() {
        System.out.println("Duck eating");
    }

    @Override
    public void fly() {
        System.out.println("Duck flying");
    }
        

  
}
