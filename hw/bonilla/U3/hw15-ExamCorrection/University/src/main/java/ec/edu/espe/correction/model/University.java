package ec.edu.espe.correction.model;

/**
 *
 * @author Jairo Bonilla, Gaman GeekLords, DCCO-ESPE
 */
public class University
{
    private String name;
    private int id;
    private int ranking;

    public University(String nombre, int id, int ranking) {
        this.name = nombre;
        this.id = id;
        this.ranking = ranking;
    }

    public String getNombre() {
        return name;
    }

    public void setNombre(String nombre) {
        this.name = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }
    
    
}
