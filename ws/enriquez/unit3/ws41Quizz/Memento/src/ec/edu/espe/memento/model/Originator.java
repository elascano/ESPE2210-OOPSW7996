package ec.edu.espe.memento.model;

/**
 *
 * @author Sheylee Enriquez, Developer Bears, DCCO-ESPE
 */
public class Originator {
    private String state;
 
    public void setState(String state) {
        this.state = state;
    }
 
    public String getState() {
        return state;
    }
 
    public Memento save() {
        return new Memento(state);
    }
 
    public void restore(Memento memento) {
        this.state = memento.getState();
    }
} 