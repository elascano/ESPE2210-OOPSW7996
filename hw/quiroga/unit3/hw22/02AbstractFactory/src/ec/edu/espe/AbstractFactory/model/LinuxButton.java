package ec.edu.espe.AbstractFactory.model;

/**
 *
 * @author Francisco Quiroga, Search Engine Bandits , DCCO-ESPE
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
