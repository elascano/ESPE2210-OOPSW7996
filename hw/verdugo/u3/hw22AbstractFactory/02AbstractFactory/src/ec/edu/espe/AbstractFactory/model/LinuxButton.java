package ec.edu.espe.AbstractFactory.model;

/**
 *
 * @author Sebastian Verdugo, ProgressTeam, DCOO-ESPE
 */
public class LinuxButton extends Button {

    LinuxButton() {

    }

    @Override
    public String paint() {
        String widget = "LinuxButton";
        
        return widget;
    }

}