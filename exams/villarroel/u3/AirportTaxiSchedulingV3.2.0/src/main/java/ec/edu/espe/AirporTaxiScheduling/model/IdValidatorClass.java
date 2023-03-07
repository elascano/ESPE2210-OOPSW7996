package ec.edu.espe.AirporTaxiScheduling.model;


/**
 *
 * @author Justin Villarroel, ProgressTeam, DCCO-ESPE
 */
public class IdValidatorClass {
          private String id;
          private boolean validator;

          public IdValidatorClass(String id, boolean validator) {
                    this.id = id;
                    this.validator = validator;
          }

          
          
          /**
           * @return the id
           */
          public String getId() {
                    return id;
          }

          /**
           * @param id the id to set
           */
          public void setId(String id) {
                    this.id = id;
          }

          /**
           * @return the validator
           */
          public boolean isValidator() {
                    return validator;
          }

          /**
           * @param validator the validator to set
           */
          public void setValidator(boolean validator) {
                    this.validator = validator;
          }
}
