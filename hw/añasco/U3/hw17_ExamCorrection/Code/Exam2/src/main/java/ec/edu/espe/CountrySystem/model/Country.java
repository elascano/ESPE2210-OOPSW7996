package ec.edu.espe.CountrySystem.model;

/**
 *
 * @author Añasco Silvia, DeltaTeam, DCCO-ESPE
 */
public class Country {
    private String name;
    private long population;
    private String currentPresident;

    public Country(String name, long population, String currentPresident) {
        this.name = name;
        this.population = population;
        this.currentPresident = currentPresident;
    }
    
    public Country() {
        name = "";
        population = 0;
        currentPresident = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public String getCurrentPresident() {
        return currentPresident;
    }

    public void setCurrentPresident(String currentPresident) {
        this.currentPresident = currentPresident;
    }

    @Override
    public String toString() {
        return "Country{" + "name=" + name + ", population=" + population + ", currentPresident=" + currentPresident + '}';
    }
    
     
    
}
