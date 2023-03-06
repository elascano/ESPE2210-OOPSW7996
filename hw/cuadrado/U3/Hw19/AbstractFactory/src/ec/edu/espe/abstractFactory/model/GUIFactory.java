package ec.edu.espe.abstractFactory.model;

/**
 *
 * @author Sheylee Enriquez, Developer Bears, DCCO-ESPE
 */
public abstract class GUIFactory {

    public static GUIFactory getFactory() {

        //int sys = readFromConfigFile("OS_TYPE");
        int sys = 1;
        if (sys == 0) {
            return (new WinFactory());
        } else {
            return (new LinuxFactory());
        }
    }

    public abstract Button createButton();

    public abstract Menu createMenu();
}
