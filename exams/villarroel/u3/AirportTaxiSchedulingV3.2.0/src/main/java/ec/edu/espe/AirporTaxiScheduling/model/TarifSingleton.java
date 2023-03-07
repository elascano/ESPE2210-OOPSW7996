package ec.edu.espe.AirporTaxiScheduling.model;

/**
 *
 * @author Jefferson Ulco,ProgressTeam,DCCO-ESPE
 */
public class TarifSingleton {

          private static TarifSingleton instance;
          private float tarifValue;
          private float kilometerNumber;
          private float kilometerValue;

          private TarifSingleton() {
                    this.tarifValue = 0.40F;
          }

          public TarifSingleton(float tarifValue, float kilometerNumber, float kilometerValue) {
                    this.tarifValue = tarifValue;
                    this.kilometerNumber = kilometerNumber;
                    this.kilometerValue = kilometerValue;
          }

          

          public void modifyValue(float tarifValue) {
                    this.tarifValue = tarifValue;
          }

          public static TarifSingleton getInstance() {
                    if (instance == null) {
                              instance = new TarifSingleton();
                    }
                    return instance;
          }

          public float totalTarif(float kilometer) {
                    float tarif = kilometer * this.tarifValue;
                    return tarif;
          }

          public float getTarifValue() {
                    return tarifValue;
          }

          /**
           * @return the kilometerNumber
           */
          public float getKilometerNumber() {
                    return kilometerNumber;
          }

          /**
           * @param kilometerNumber the kilometerNumber to set
           */
          public void setKilometerNumber(float kilometerNumber) {
                    this.kilometerNumber = kilometerNumber;
          }

          /**
           * @return the kilometerValue
           */
          public float getKilometerValue() {
                    return kilometerValue;
          }

          /**
           * @param kilometerValue the kilometerValue to set
           */
          public void setKilometerValue(float kilometerValue) {
                    this.kilometerValue = kilometerValue;
          }
}
