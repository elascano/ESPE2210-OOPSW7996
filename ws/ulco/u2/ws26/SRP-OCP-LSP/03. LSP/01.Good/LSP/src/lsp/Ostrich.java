package lsp;

/**
 *
 * @author Jefferson Ulco,ProgressTeam,DCCO-ESPE

*/
public class Ostrich extends Bird {
    
    @Override
    public void eat() {
        System.out.println("Ostrich eating");
    }

    @Override
    public void fly() {
        System.out.println("Ostriches can't fly");
    }
    
}
