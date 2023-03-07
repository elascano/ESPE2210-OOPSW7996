package ec.edu.espe.model;


/**
 *
 * @author Jairo Bonilla, Gaman GeekLords, DCCO-ESPE
 */
public class Algorithm {
    private int id;
    private String num;
    private int number;

    public Algorithm() {
    }

    public Algorithm(int id, String nombre, int age) {
        this.id = id;
        this.num = nombre;
        this.number = age;
    }

    public int getAge() {
        return number;
    }

    public void setAge(int age) {
        this.number = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return num;
    }

    public void setNombre(String nombre) {
        this.num = nombre;
    }
    
    
}
