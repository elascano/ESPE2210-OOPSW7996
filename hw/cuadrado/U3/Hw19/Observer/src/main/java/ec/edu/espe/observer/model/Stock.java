package ec.edu.espe.observer.model;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Miguel Gutierrez, Pythons, DCCO-ESPE
 */
abstract class Stock {

    protected String symbol;
    protected double price;
    
    private ArrayList investors = new ArrayList();

    public Stock() {}

    public void addObserver(IInvestor iinvestor) {
        investors.add(iinvestor);
    }

    public void deleteObserver(IInvestor iinvestor) {
        investors.remove(iinvestor);
    }

    public void notifyObservers(Object args) {
        Iterator i = investors.iterator();
        while (i.hasNext()) {
            IInvestor investor = (IInvestor) i.next();
            investor.update(this, args);
        }
    }

    String getSymbol() {
        return symbol;
    }
    
}
