package ec.edu.espe.AbstractFactory.model;

/**
 *
 * @author Lindsay Barrionuevo, DeltaTeam, DCCO-ESPE
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
