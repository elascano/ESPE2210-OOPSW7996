package ec.edu.espe.AirporTaxiScheduling.utils;

/**
 *
 * @author Justin Villarroel, ProgressTeam, DCCO-ESPE
 */
public class Validation {
          public static boolean IdValidation(String IdValidator) {
                    int sum = 0;
                    for (int i = 0; i < IdValidator.length() - 1; i++) {
                              int digit = Integer.parseInt(IdValidator.substring(i, i + 1));
                              if (i % 2 == 0) {
                                        digit *= 2;
                                        if (digit > 9) {
                                                  digit -= 9;
                                        }
                              }
                              sum += digit;
                    }

                    int check = 10 - (sum % 10);
                    if (check == 10) {
                              check = 0;
                    }

                    return check == Integer.parseInt(IdValidator.substring(9, 10));
          }
}
