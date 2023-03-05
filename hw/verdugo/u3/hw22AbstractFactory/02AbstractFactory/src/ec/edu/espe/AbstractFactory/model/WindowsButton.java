package ec.edu.espe.AbstractFactory.model;

/**
 *
 * @author Sebastian Verdugo, ProgressTeam, DCOO-ESPE
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
