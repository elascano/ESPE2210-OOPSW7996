
package ec.edu.espe.AbstractFactory.model;

/**
 *
 * @author Carlos Torres, T09_PACSTORE, DCCO-ESPE
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