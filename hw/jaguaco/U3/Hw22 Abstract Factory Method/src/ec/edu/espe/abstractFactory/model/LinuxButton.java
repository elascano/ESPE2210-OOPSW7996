package ec.edu.espe.abstractFactory.model;

/**
 *
 * @author Jonathan Jaguaco, Pythons, DCCO-ESPE
 */
class LinuxButton extends Button {

    @Override
    public void paint() {
        System.out.println("I'm a LinuxButton: " + caption);
    }
}