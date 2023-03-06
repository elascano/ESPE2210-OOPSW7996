package ec.edu.espe.AbstractFactory.model;

/**
 *
 * @author Karla Ansatuña, Scriptal, DCCO-ESPE
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
