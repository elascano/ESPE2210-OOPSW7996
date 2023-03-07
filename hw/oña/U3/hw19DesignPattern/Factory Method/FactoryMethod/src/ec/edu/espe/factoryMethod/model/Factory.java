
package ec.edu.espe.factoryMethod.model;

import ec.edu.espe.factoryMethod.controller.Connection;

/**
 *
 * @author Yorman Oña, GiftSoft Team, DCCO-ESPE
 */
public abstract class Factory {
    public Factory() {
    }

    public abstract Connection createConnection(String type); // Factory method
}
