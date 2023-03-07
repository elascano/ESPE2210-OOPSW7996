package ec.edu.espe.abstractFactory.model;
/**
 *
 * @author Jonathan Jaguaco, Pythons, DCCO-ESPE
 */
public abstract class GUIFactory {

    public static GUIFactory getFactory() {
        String sysName;        
        sysName = System.getProperty("os.name");
        
        if (sysName.contains("Windows")) {
            return (new WinFactory());
        } else {
            return (new LinuxFactory());
        }
    }   

    public abstract Button createButton();

    public abstract Menu createMenu();
}