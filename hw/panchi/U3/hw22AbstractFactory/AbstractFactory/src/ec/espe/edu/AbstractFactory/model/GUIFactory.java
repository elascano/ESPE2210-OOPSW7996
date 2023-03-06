package ec.espe.edu.AbstractFactory.model;

import java.awt.Button;
import java.awt.Menu;

/**
 *
 * @author Allan Panchi, GiftSoft Team, DCCO-ESPE
 */
public abstract class GUIFactory {
    public static GUIFactory getFactory() {
        String os = System.getProperty("os.name").toUpperCase();
        System.out.println(os);

        if (os.contains("WINDOWS"))
        {
            return (new WinFactory());
        } else
        {
            return (new LinuxFactory());
        }
    }

    
    public abstract Button createButton();
    public abstract Menu createMenu();
}
