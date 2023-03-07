package ec.edu.espe.memento.model;

/**
 *
 * @author Sheylee Enriquez, Developer Bears, DCCO-ESPE
 */
public class Memento {
    private final String state;
 
    public Memento(String stateToSave) {
        state = stateToSave;
    }
 
    public String getState() {
        return state;
    }
}