package ec.edu.espe.AirporTaxiScheduling.model;

import ec.edu.espe.AirporTaxiScheduling.controller.ISubscribedTraveler;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Leonardo Yaranga,Progress Team, DCCO-ESPE
 */
public abstract class PendingTask {

     protected boolean payed;
    protected float travelPrice;
    private ArrayList subsTravelers=new ArrayList();

    public PendingTask() {
    }
    
     public void addSubsTraveler(ISubscribedTraveler iiISubscribedTraveler ){
                    subsTravelers.add(iiISubscribedTraveler);
          }

          public void deleteSubsTraveler(ISubscribedTraveler iiISubscribedTraveler) {
                   subsTravelers.remove(iiISubscribedTraveler);
          }

          public void notifySubsTraveler(Object args) {
                    Iterator iterator = subsTravelers.iterator();
                    while (iterator.hasNext()) {
                              ISubscribedTraveler subsTraveler = (ISubscribedTraveler) iterator.next();
                              subsTraveler.notifyUncollectedTravels(this, args);
                    }
          }
    
}
