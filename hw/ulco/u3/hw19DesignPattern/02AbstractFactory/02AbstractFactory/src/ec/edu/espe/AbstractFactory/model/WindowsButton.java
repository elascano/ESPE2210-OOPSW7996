package ec.edu.espe.AbstractFactory.model;

/**
 *
 * @author Leonardo Yaranga,Progress Team, DCCO-ESPE
 */
public class WindowsButton extends Button {

    WindowsButton() {
    }

    @Override
    public void paint() {
        System.out.println("I'm a WindowsButton:" + caption);
    }

}
