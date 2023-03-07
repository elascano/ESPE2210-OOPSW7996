package ec.edu.espe.Proxy.model;

/**
 *
 * @author Alex Trejo, PACSTORE, DCCO-ESPE
 */
public class ImageProxy implements Image {

    private RealImage realImage;
    private final String fileName;

    /**
     *
     * @param fileName
     */
    public ImageProxy(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }

}
