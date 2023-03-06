package ec.edu.espe.AbstractFactory.model;

/**
 *
 * @author Matias Suarez,WebMasterTeam,DCCO-ESPE
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
