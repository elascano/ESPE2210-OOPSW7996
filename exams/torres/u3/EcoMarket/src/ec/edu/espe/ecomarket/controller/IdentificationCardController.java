package ec.edu.espe.ecomarket.controller;

/**
 *
 * @author Alex Trejo, PACSTORE, DCCO-ESPE
 */
public class IdentificationCardController {

    public static boolean validateID(String identificationCard) {

        int suma = 0;

        if (identificationCard.length() != 10) {

            return false;
        }

        for (int i = 0; i < 9; i++) {
            int digit = Integer.parseInt(identificationCard.charAt(i) + "");
            if (i % 2 == 0) {
                digit = digit * 2;
                if (digit > 9) {
                    digit -= 9;
                }
            }
            suma += digit;
        }
        int lastDigit = Integer.parseInt(identificationCard.charAt(9) + "");
        int digitVerifier = 10 - (suma % 10);
        if (digitVerifier == 10) {
            digitVerifier = 0;
        }
        return lastDigit == digitVerifier;
    }

}
