package ec.edu.espe.model;

/**
 *
 * @author David Toapanta, Pacstore, DCCO-ESPE
 */
public class PairOfShoes {
    private String pairofshoes;
    private String brand;
    private int price;

    public PairOfShoes() {
        
    }

    public PairOfShoes(String pairofshoes, String brand, int price) {
        this.pairofshoes = pairofshoes;
        this.brand = brand;
        this.price = price;
    }

    public String getPairofshoes() {
        return pairofshoes;
    }

    public void setPairofshoes(String pairofshoes) {
        this.pairofshoes = pairofshoes;
    }

    

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "PairOfShoes{" + "pairofshoes=" + pairofshoes + ", brand=" + brand + ", price=" + price + '}';
    }

}
