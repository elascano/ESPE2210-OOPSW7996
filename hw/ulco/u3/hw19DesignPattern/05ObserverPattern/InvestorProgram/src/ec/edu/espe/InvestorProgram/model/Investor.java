package ec.edu.espe.InvestorProgram.model;

/**
 *
 * @author Justin Villarroel, ProgressTeam, DCCO-ESPE
 */
 public class Investor implements IInvestor {

          private String name;
          private String observerState;
          private Stock stock;

          public Investor(String name) {
                    this.name = name;
          }
          public void update(Stock tock, Object args) {
                    System.out.println("notified observer " + name);
                    if (args instanceof String) {
                              System.out.println("the symbol of " + " changed to: " + args);
                    } else if (args instanceof Double) {
                              System.out.println("The price of " + "changed to: " + args);

                    }
          }

}
