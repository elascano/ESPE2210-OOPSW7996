package ec.edu.espe.dogregister.model;

/**
 *
 * @author Alejandro Cuadrado
 */
public class Dog {
    private int id;
    private String name;
    private float age;
    
    public Dog(){
        id=0;
        name="";
        age=0;
    }
    @Override
    public String toString() {
        return "Dog{" + "id=" + id + ", name=" + name + ", age=" + age + '}';
    }
    public Dog(int id, String name, float age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public float getAge() {
        return age;
    }
    public void setAge(float age) {
        this.age = age;
    }
}
