
package ec.edu.espe.Observer.model;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Christopher Bazurto, DeltaTeam, DCCO-ESPE
 */
abstract class Stock {
private String symbol;
private double price;

private ArrayList investors = new ArrayList();
public Stock() { }
public void addObserver( IInvestor iinvestor ) {
        getInvestors().add( iinvestor );
}
public void deleteObserver( IInvestor iinvestor ) {
        getInvestors().remove( iinvestor );
}
public void notifyObservers(Object args) {
Iterator i = getInvestors().iterator();
while( i.hasNext() ) {
IInvestor investor = (IInvestor)i.next();
investor.update(this,args );
}
}

    /**
     * @return the symbol
     */
    public String getSymbol() {
        return symbol;
    }

    /**
     * @param symbol the symbol to set
     */
    public void setSymbol(String symbol) {
        this.symbol = symbol;
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
    }

    /**
     * @return the investors
     */
    public ArrayList getInvestors() {
        return investors;
    }

    /**
     * @param investors the investors to set
     */
    public void setInvestors(ArrayList investors) {
        this.investors = investors;
    }
}
