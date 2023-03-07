package ec.edu.espe.AirporTaxiScheduling.model;

/**
 *
 * @author Justin Villarroel, ProgressTeam, DCCO-ESPE
 */
public class ObtainIdClass {
          private String obtainId;
          private int id;

          public ObtainIdClass(String obtainId, int id) {
                    this.obtainId = obtainId;
                    this.id = id;
          }
          
          

          /**
           * @return the obtainId
           */
          public String getObtainId() {
                    return obtainId;
          }

          /**
           * @param obtainId the obtainId to set
           */
          public void setObtainId(String obtainId) {
                    this.obtainId = obtainId;
          }

          /**
           * @return the id
           */
          public int getId() {
                    return id;
          }

          /**
           * @param id the id to set
           */
          public void setId(int id) {
                    this.id = id;
          }
          
}
