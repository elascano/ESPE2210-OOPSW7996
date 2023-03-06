package ec.edu.espe.observer.model;

/**
 *
 * @author Miguel Gutierrez, Pythons, DCCO-ESPE
 */
public class IBM extends Stock {

    public IBM(String symbol, double price) {
        this.symbol = symbol;
        this.price = price;
    }
    
    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }
    
    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
        notifyObservers(price);
    }

    /**
     * @return the symbol
     */
    @Override
    public String getSymbol() {
        return symbol;
    }
    
    /**
     * @param symbol the symbol to set
     */
    public void setSymbol(String symbol) {
        this.symbol = symbol;
        notifyObservers(symbol);
    }

}
