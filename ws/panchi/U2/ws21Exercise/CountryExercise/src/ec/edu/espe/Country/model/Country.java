package ec.edu.espe.Country.model;

/**
 *
 * @author Allan Panchi, GiftSoft Team, DCCO-ESPE
 */
public class Country {
    private int id;
    private String name;
    private int cities;
    
    public Country(){
        id = 0;
        name = "";
        cities = 0;
    }
    
    @Override
    public String toString() {
        return "Country{" + "id=" + id + ", name=" + name + ", cities=" + cities + '}';
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
     * @return the cities
     */
    public int getCities() {
        return cities;
    }

    /**
     * @param cities the cities to set
     */
    public void setCities(int cities) {
        this.cities = cities;
    }
    
    
}
