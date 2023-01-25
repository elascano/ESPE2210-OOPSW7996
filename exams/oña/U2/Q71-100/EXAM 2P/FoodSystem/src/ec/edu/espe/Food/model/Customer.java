package ec.edu.espe.Food.model;

/**
 *
 * @author GiftSoft TEAM, DCCO-ESPE
 */

public class Customer extends Food {

    protected String fullNames;
    protected String surnames;
   
   

public Customer(String fullNames, String surnames, String food, String cost, String paymentMethod) {
    super(food, cost, paymentMethod);
    this.fullNames = fullNames;
    this.surnames = surnames;
}

public Customer() {
}
    

public String getFullNames() {
    return fullNames;
}

public void setFullNames(String fullNames) {
    this.fullNames = fullNames;
}

public String getSurnames() {
    return surnames;
}

public void setSurnames(String surnames) {
    this.surnames = surnames;
}


}
