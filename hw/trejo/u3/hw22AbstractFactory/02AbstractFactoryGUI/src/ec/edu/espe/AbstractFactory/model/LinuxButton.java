package ec.edu.espe.AbstractFactory.model;

/**
 *
 * @author Alex Trejo, PACSTORE, DCCO-ESPE
 */
public class LinuxButton extends Button {

    LinuxButton() {

    }

    @Override
    public String paint() {
        String widget = "I'm a LinuxButton: "+caption;
        
        return widget;
    }

}
