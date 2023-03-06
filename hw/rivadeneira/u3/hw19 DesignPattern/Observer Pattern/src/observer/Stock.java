
package observer;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Ariel Rivadeneira, Search Engine Bandits, DCCO-ESPE
 */
public abstract class Stock {
    protected String symbol;
    protected double price;
    
    private ArrayList investors = new ArrayList();
    String getSymbol;
    public Stock() { }
    
    public void addObserver( IInvestor iinvestor ) {
        investors.add( iinvestor );
    }
    
    public void deleteObserver( IInvestor iinvestor ) {
        investors.remove( iinvestor );
    }
    public void notifyObservers(Object args) {
        Iterator i = investors.iterator();
        while( i.hasNext() ) {
            IInvestor investor = (IInvestor)i.next();
            investor.update(this,args );
        }
    }

    String getSymbol() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
