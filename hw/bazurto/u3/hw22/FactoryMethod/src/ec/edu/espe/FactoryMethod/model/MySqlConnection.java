
package ec.edu.espe.FactoryMethod.model;

/**
 *
 *  @author christopher bazurto, DeltaTeam,DCCO-ESPE
 */
public class MySqlConnection extends Connection {
    public MySqlConnection() {
    }
    public String description() {
        return "MySQL";
    }
    
}
