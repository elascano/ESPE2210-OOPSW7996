package ec.edu.espe.Proxy.view;

import ec.edu.espe.Proxy.model.Image;
import ec.edu.espe.Proxy.model.ImageProxy;



/**
 *
 * @author Alex Trejo, PACSTORE, DCCO-ESPE
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Image image = new ImageProxy("test_10mb.jpg");
        // loading the image file only when required
        image.display();

    }

}
