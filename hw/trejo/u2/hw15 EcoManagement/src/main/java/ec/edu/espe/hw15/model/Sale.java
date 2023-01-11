package ec.edu.espe.hw15.model;

/**
 *
 * @author Alex Trejo, PACSTORE, DCCO-ESPE
 */
public class Sale {

    private String nameOfProduct;
    private int amountOfProductSold;
    double totalMoney;
    

    public Sale(String nameOfProduct, int amountOfProductSold, double totalMoney) {
        this.nameOfProduct = nameOfProduct;
        this.amountOfProductSold = amountOfProductSold;
        this.totalMoney = totalMoney;
    }
    
    public Sale() {
        nameOfProduct = "";
        amountOfProductSold = 0;
        totalMoney = 0.0;
    }

    @Override
    public String toString() {
        return "Sale{" + "nameOfProduct=" + nameOfProduct + ", amountOfProductSold=" + amountOfProductSold + ", totalMoney=" + totalMoney + '}';
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public void setNameOfProduct(String nameOfProduct) {
        this.nameOfProduct = nameOfProduct;
    }

    public int getAmountOfProductSold() {
        return amountOfProductSold;
    }

    public void setAmountOfProductSold(int amountOfProductSold) {
        this.amountOfProductSold = amountOfProductSold;
    }

    public double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(double totalMoney) {
        this.totalMoney = totalMoney;
    }

}
