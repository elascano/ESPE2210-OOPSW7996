package ec.esu.espe.abstractFactory.model;
/**
 *
 * @author Jairo Bonilla, Gaman GeekLords, DCCO-ESPE
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
