package ec.edu.espe.VeterinarySystemControl.model;

/**
 *
 * @author Karla Ansatuña
 */
public class Pet {
    private int id;
    private String name;
    private String species;
    private String gender;
    private int age;
    private int ownerTelephone;

    @Override
    public String toString() {
        return "Pet{" + "id=" + id + ", name=" + name + ", species=" + species + ", gender=" + gender + ", age=" + age + ", ownerTelephone=" + ownerTelephone + '}';
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

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getOwnerTelephone() {
        return ownerTelephone;
    }

    public void setOwnerTelephone(int ownerTelephone) {
        this.ownerTelephone = ownerTelephone;
    }

    public Pet() {
        name = "";
        species = "";
        gender = "";
        age = 0;
        ownerTelephone = 0;
    }

}
