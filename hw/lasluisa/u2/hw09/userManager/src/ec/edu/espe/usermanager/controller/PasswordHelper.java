package ec.edu.espe.usermanager.controller;

/**
 *
 * @author Erick Lasluisa, Pythons, DCCO-ESPE
 */
public class PasswordHelper {

    public static void validateNewPassword(String password, String newPassword) throws PasswordException {

        if (password.equals(newPassword)) {
            throw new PasswordException("The new password is the same as the previous password.");
        }

        if (password.length() < 6) {
            throw new PasswordException("The new password is too short.");
        }
    }

}
