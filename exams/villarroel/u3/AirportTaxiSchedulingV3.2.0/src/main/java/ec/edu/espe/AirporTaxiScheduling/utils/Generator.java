
package ec.edu.espe.AirporTaxiScheduling.utils;

/**
 *
 * @author Leonardo Yaranga,Progress Team, DCCO-ESPE
 */
public class Generator {

          public static int generateId() {
                    int id;
                    id = (int) ((Math.random() * (9999 - 1000)) + 1000);
                    return id;
          }
          
          public static int obtainIdTraveler(String obtainId) {
                    int size = 5;
                    int idTraveler;
                    String id = obtainId.length() < size ? obtainId : obtainId.substring(0, size);
                    char[] posicions = id.toCharArray();
                    String character = "";
                    for (int i = 0; i < id.length(); i++) {
                              if (Character.isDigit(posicions[i])) {
                                        character += posicions[i];
                              }
                    }
                    idTraveler = Integer.valueOf(character);
                    return idTraveler;
          }

}
