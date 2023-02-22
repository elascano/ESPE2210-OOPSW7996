package ec.edu.espe.AbstractFactory.model;

/**
 *
 * @author Jerly Reinoso, Search Engine Bandits, DCCO-ESPE
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
