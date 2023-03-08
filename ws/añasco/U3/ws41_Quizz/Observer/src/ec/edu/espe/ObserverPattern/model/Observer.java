package ec.edu.espe.ObserverPattern.model;

/**
 *
 * @author Añasco Silvia, DeltaTeam, DCCO-ESPE
 */
public interface Observer {
    void update(float temperature, float humidity, float pressure);
}
