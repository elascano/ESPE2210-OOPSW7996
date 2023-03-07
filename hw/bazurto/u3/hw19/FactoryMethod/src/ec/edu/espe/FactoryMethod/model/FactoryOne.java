
package ec.edu.espe.FactoryMethod.model;

/**
 *
 *  @author christopher bazurto, DeltaTeam,DCCO-ESPE
 */
public class FactoryOne extends Factory {

    @Override
    protected Object createConnection(String type) {
        if (type.equals("Oracle")){
        return new OracleConnection();
        }
        else{
        return new MySqlConnection();
        }
    }
    
}
