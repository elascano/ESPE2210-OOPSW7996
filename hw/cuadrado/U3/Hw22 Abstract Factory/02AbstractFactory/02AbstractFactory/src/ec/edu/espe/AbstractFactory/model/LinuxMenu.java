package ec.edu.espe.AbstractFactory.model;
/**
 *
 * @author Alejandro Cuadrado, DCCO-ESPE
 */
public class LinuxMenu extends Menu {
    LinuxMenu() {
    }
    @Override
    public String paint() {
        String widget = "LinuxMenu";   
        return widget;
    }
}