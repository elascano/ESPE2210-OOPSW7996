
package ec.edu.espe.clientapp.model;

/**
 *
 * @author Diego Pilataxi, GitSoftTeam, DCCO-ESPE
 */
public abstract class GUIFactory {
    public static GUIFactory getFactory(){
        String sysName;
        sysName = System.getProperty("OS_TYPE");
        
        if (sysName != null && sysName.contains("Windows")){
            return new WinFactory();
        }else{
            return new LinuxFactory();
        }
    }
    public abstract Button createButton();
    
    public abstract Menu createMenu();
}
