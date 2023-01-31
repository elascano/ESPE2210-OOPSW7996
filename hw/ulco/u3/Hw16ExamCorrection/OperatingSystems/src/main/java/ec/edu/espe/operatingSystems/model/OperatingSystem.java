package ec.edu.espe.operatingSystems.model;

/**
 *
 * @author Jefferson Ulco,ProgressTeam,DCCO-ESPE
 */
public class OperatingSystem {

    private int id;
    private String name;
    private int year;

    @Override
    public String toString() {
        return "OperatingSystem{" + "id=" + id + ", name=" + name + ", year=" + year + '}';
    }

    public OperatingSystem() {
        this.id = 0;
        this.name = "";
        this.year = 0;
    }

    public OperatingSystem(int id, String name, int year) {
        this.id = id;
        this.name = name;
        this.year = year;
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
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }

}
