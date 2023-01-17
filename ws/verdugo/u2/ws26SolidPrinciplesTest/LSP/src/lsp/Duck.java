
package lsp;

/**
 *
 * @author Sebastian Verdugo, ProgressTeam, DCOO-ESPE
 */
public class Duck extends Bird {

    /**
     *
     */
    public void fly(){
        System.out.println("Flying");
    }

    /**
     *
     */
    @Override
        public void eat() {
        System.out.println("Eating");
    }
}
