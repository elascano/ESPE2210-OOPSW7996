
package ec.edu.espe.shopinventory_v2.model;

/**
 *
 * @author Francisco Quiroga, Search Engine Bandits , DCCO-ESPE
 */
public class PrincipalUser {
    private static PrincipalUser instance;
    private String password;

    private PrincipalUser() {
        this.password = "SearchEngineBandits";
    }

    public static PrincipalUser getInstance() {
        if (instance == null) {
            instance = new PrincipalUser();
        }
        return instance;
    }


    public String getPassword() {
        return password;
    }
}
