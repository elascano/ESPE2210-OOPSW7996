package ec.edu.espe.abstractfactory.model;

/**
 *
 * @author Elkin Pabon, GiftSoft TEAM, DCCO-ESPE
 */

public abstract class GUIFactory {
        
    public static GUIFactory getFactory(){
        
        String os = System.getProperty("os.name").toLowerCase();
        System.out.println(os);
        
        if(os.contains("windows"))
            return(new WinFactory());
        else if(os.contains("linux")){
            return(new LinuxFactory());
        }
        return null;
        
    }
    
    public abstract Button createButton();
    public abstract Menu createMenu();
    
}
