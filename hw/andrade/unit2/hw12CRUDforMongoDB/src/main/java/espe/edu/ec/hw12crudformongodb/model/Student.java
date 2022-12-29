
package espe.edu.ec.hw12crudformongodb.model;

/**
 *
 * @author Alejandro Andrade, Scriptal, DCCO_ESPE
 */
public class Student {
    private int id;
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", age=" + age + '}';
    }

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }
}
