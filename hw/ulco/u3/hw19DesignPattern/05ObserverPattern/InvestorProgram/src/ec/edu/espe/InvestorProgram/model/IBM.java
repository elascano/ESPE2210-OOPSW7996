package ec.edu.espe.InvestorProgram.model;

/**
 *
 * @author Justin Villarroel, ProgressTeam, DCCO-ESPE
 */
public class IBM extends Stock {

          private String symbol;
          private double price;
          
          public IBM(String symbol, double price) {
                    this.symbol = symbol;
                    this.price = price;
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
                    notifyObservers(symbol);
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
          
}
