package ec.edu.espe.hw09.model;

/**
 *
 * @author NicolayChillo Gaman GeekLords at DCOO-ESPE
 */
public class Tool {
    private int id;

    public Tool(String nameTool, int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Tool{" + "id=" + id + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }   
}
