package ec.edu.espe.movie.model;

/**
 *
 * @author David Toapanta, Pacstore, DCCO-ESPE
 */
public class Movie {
    private int id;
    private String nombre;
    private int age;

    public Movie() {
    }

    public Movie(int id, String nombre, int age) {
        this.id = id;
        this.nombre = nombre;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
