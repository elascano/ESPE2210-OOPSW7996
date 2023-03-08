package ec.edu.espe.SingletonGUI.model;

/**
 *
 * @author Añasco Silvia, DeltaTeam, DCCO-ESPE
 */
public class Usser {
    private String usserName;
    private String password;
    private String status;

    public Usser(String usserName, String password, String status) {
        this.usserName = usserName;
        this.password = password;
        this.status = status;
    }
    
    public Usser() {
        usserName = "";
        password = "";
        status = "";
    }

    public String getUsserName() {
        return usserName;
    }

    public void setUsserName(String usserName) {
        this.usserName = usserName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
