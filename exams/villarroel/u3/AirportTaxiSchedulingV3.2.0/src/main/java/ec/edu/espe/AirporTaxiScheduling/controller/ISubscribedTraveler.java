
package ec.edu.espe.AirporTaxiScheduling.controller;

import ec.edu.espe.AirporTaxiScheduling.model.PendingTask;

/**
 *
 * @author Leonardo Yaranga,Progress Team, DCCO-ESPE
 */
public interface ISubscribedTraveler {
    void notifyUncollectedTravels(PendingTask pendingTask,Object args);
}
