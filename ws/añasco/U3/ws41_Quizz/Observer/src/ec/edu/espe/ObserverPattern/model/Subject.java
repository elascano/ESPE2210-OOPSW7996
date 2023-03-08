package ec.edu.espe.ObserverPattern.model;

/**
 *
 * @author Añasco Silvia, DeltaTeam, DCCO-ESPE
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
