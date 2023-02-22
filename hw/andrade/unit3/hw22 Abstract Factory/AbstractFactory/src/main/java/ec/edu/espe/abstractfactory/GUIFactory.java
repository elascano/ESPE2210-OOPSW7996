package ec.edu.espe.abstractfactory;

/**
 *
 * @author Alejandro Andrade, Scriptal, DCCO_ESPE
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
