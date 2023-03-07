package ec.edu.espe.calculatorIva.model;

/**
 *
 * @author Justin Villarroel, ProgressTeam, DCCO-ESPE
 */
public final class USTax {

          private float valueTax;
          private static USTax instance;

          private USTax(float value) {
                    setValueTax(value);
          }

          public static USTax getInstance(float value) {
                    if (getInstance() == null) {
                              setInstance(new USTax(value));
                    }
                    return getInstance();
          }

          public void salesTotal(float totalValue) {
                    System.out.println("Tax Applied ==>  " + getValueTax());
                    System.out.println("Total value with taxes would be:  " + (totalValue));
          }

          /**
           * @param aInstance the instance to set
           */
          public static void setInstance(USTax aInstance) {
                    instance = aInstance;
          }

          /**
           * @return the instance
           */
          public static USTax getInstance() {
                    return instance;
          }

          /**
           * @return the valueTax
           */
          public float getValueTax() {
                    return valueTax;
          }

          /**
           * @param valueTax the valueTax to set
           */
          public void setValueTax(float valueTax) {
                    this.valueTax = valueTax;
          }
}
