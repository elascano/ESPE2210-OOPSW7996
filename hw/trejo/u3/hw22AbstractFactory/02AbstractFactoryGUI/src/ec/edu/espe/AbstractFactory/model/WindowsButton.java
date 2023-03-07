package ec.edu.espe.AbstractFactory.model;

/**
 *
 * @author Alex Trejo, PACSTORE, DCCO-ESPE
 */
public class WindowsButton extends Button {

    WindowsButton() {
    }

    @Override
    public String paint() {
        String widget;
        widget = "I'm a WindowsButton: " + caption;

        return widget;
    }

}
