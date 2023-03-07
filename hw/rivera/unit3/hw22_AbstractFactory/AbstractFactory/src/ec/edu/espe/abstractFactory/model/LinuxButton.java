package ec.edu.espe.abstractFactory.model;

/**
 *
 * @author Joel Rivera, WebMasterTeam, DCCO-ESPE
 */

class LinuxButton extends Button {

    public void paint() {
        System.out.println("I'm a LinuxButton: " + caption);
    }
}
