package ec.edu.espe.AbstractFactory.model;
/**
 *
 * @author Alejandro Cuadrado, DCCO-ESPE
 */
public class WindowsButton extends Button {
    WindowsButton() {
    }
    @Override
    public String paint() {
        String widget = "WindowsButton";        
        return widget;
    }
}