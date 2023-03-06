
package ec.edu.espe.clientapp.controller;

import ec.edu.espe.clientapp.model.Button;
import ec.edu.espe.clientapp.model.Menu;

/**
 *
 * @author Ariel Rivadeneira, Search Engine Bandits, DCCO-ESPE
 */
public abstract class GUIFactory {
    public static GUIFactory getFactory() {
        String sys = System.getProperty("os.name");
        
        if (sys.contains("Windows"))
            return (new WinFactory());
        else
            return (new LinuxFactory());
    }
    
    public abstract Button createButton();
    public abstract Menu createMenu();
} 