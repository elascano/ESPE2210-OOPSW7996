package lsp;

/**
 *
 * @author Jefferson Ulco,ProgressTeam,DCCO-ESPE
*/

public class Duck extends Bird {

    
    public void fly() {
        System.out.println("Duck flying");
    }

    @Override
    public void eat() {
        System.out.println("Duck eating");
    }
 }
