package ec.edu.espe.InClass.model;

/**
 *
 * @author Alejandro Cuadrado, DCCO-ESPE
 */
public class Tutorship {
    private String id;
    private String NRC;
    private String name;

    public Tutorship(String id, String NRC, String name) {
        this.id = id;
        this.NRC = NRC;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Tutorship{" + "id=" + id + ", NRC=" + NRC + ", name=" + name + '}';
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getBatch() {
        return NRC;
    }
    public void setBatch(String NRC) {
        this.NRC = NRC;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}
