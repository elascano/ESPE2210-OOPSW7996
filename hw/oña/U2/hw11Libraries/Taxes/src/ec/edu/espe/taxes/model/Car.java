
package ec.edu.espe.taxes.model;

/**
 *
 * @author Yorman Oña, GiftSoft Team, DCCO-ESPE
 */
public class Car extends Product{
    
    public Car(int id, String description, float price, float salePrice) {
        super(id, description, price, salePrice);
    }

    @Override
    public String toString() {
        String car="";
        car = "Car{"+getDescription()+","+"Original payment="+getSalePrice()+","+"Green Tax="
                + formato1.format(getPrice())+"}";
        return car;
    }
    
}
