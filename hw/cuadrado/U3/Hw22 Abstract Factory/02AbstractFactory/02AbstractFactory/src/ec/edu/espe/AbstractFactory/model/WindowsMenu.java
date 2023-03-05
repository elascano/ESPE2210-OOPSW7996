package ec.edu.espe.AbstractFactory.model;
/**
 *
 * @author Alejandro Cuadrado, DCCO-ESPE
 */
public class WindowsMenu extends Menu {
    public WindowsMenu() {
    }
    @Override
    public String paint() {
        String widget = "WindowsMenu";        
        return widget;
    }
}