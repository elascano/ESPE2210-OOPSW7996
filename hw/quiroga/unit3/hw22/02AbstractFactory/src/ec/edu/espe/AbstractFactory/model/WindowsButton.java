package ec.edu.espe.AbstractFactory.model;

/**
 *
 * @author Francisco Quiroga, Search Engine Bandits , DCCO-ESPE
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
