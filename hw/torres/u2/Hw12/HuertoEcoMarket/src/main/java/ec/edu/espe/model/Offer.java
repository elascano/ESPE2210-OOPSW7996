package ec.edu.espe.model;


import java.util.Scanner;

/**
 *
 * @author Carlos Torres, T09_PACSTORE, DCCO-ESPE
 */
public class Offer {
    
    private String name;
    private double discount;
    private int amountSale;
    private double priceTotal;
    private double priceWithOffer;


    public Offer(String name, double discount, int amountSale, double priceTotal, double priceWithOffer) {
        this.name = name;
        this.discount = discount;
        this.amountSale = amountSale;
        this.priceTotal = priceTotal;
        this.priceWithOffer = priceWithOffer;
    }


    @Override
    public String toString() {
        return "Offer{" + "name=" + name + ", discount=" + discount + ", amountSale=" + amountSale + ", priceTotal=" + priceTotal + ", priceWithOffer=" + priceWithOffer + '}';
    }

    
    /**
     * @return the discount
     */
    public double getDiscount() {
        return discount;
    }

    /**
     * @param discount the discount to set
     */
    public void setDiscount(double discount) {
        this.discount = discount;
    }

    /**
     * @return the amountSale
     */
    public int getAmountSale() {
        return amountSale;
    }

    /**
     * @param amountSale the amountSale to set
     */
    public void setAmountSale(int amountSale) {
        this.amountSale = amountSale;
    }

    /**
     * @return the priceTotal
     */
    public double getPriceTotal() {
        return priceTotal;
    }

    /**
     * @param priceTotal the priceTotal to set
     */
    public void setPriceTotal(double priceTotal) {
        this.priceTotal = priceTotal;
    }

    /**
     * @return the priceWithOffer
     */
    public double getPriceWithOffer() {
        return priceWithOffer;
    }

    /**
     * @param priceWithOffer the priceWithOffer to set
     */
    public void setPriceWithOffer(double priceWithOffer) {
        this.priceWithOffer = priceWithOffer;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
}
