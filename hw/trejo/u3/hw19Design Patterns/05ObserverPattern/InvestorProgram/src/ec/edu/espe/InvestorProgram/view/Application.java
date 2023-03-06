package ec.edu.espe.InvestorProgram.view;

import ec.edu.espe.InvestorProgram.model.IBM;
import ec.edu.espe.InvestorProgram.model.Investor;

/**
 *
 * @author Justin Villarroel, ProgressTeam, DCCO-ESPE
 */
public class Application {

          public static void main(String[] args) {
                    Investor firstInvestor = new Investor("Sorros");
                    Investor secondInvestor = new Investor("Berkshire");
                    
                    IBM ibm = new IBM("IBM", 120.00);
                    ibm.addObserver(firstInvestor);
                    ibm.addObserver(secondInvestor);
                    
                    ibm.setPrice(120.10);
                    ibm.setPrice(121.00);
                    ibm.setPrice(120.50);
                    ibm.setPrice(120.75);
                    ibm.setSymbol("IBMTEST");
          }
}
