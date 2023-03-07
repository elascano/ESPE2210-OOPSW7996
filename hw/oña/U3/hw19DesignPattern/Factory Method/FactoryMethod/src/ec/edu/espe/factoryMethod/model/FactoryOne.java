
package ec.edu.espe.factoryMethod.model;

import ec.edu.espe.factoryMethod.controller.Connection;
import ec.edu.espe.factoryMethod.controller.MySqlConnection;
import ec.edu.espe.factoryMethod.controller.OracleConnection;

/**
 *
 * @author Yorman Oña, GiftSoft Team, DCCO-ESPE
 */
public class FactoryOne extends Factory {
    public Connection createConnection(String type) { // Factory method
        if (type.equals("Oracle")) {
            return new OracleConnection();
        } else {
            return new MySqlConnection();
        }
    }
}
