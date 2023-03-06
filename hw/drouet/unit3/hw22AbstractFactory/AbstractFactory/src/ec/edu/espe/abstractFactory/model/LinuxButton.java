package ec.edu.espe.abstractFactory.model;

/**
 *
 * @author Stephen Drouet, Developer Bears, DCC-ESPE
 */
class LinuxButton extends Button {

    @Override
    public void paint() {
        System.out.println("I'm a LinuxButton: " + caption);
    }
}
