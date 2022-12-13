package ec.edu.espe.crudJson.model;

/**
 *
 * @author NicolayChillo Gaman GeekLords at DCOO-ESPE
 */
public class Cathedral {
    private String name;
    private int yearBuild;
    private String cityWhereFind;
    
    public Cathedral(){
        name = "";
        yearBuild = 0;
        cityWhereFind = "";
    }

    public Cathedral(String name, int yearBuild, String cityWhereFind) {
        this.name = name;
        this.yearBuild = yearBuild;
        this.cityWhereFind = cityWhereFind;
    }
    
    @Override
    public String toString() {
        return "Cathedral{" + "name=" + name + "yearBuild=" + yearBuild + "cityWhereFind= " + cityWhereFind + "}";
    }
 
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearBuild() {
        return yearBuild;
    }

    public void setYearBuild(int yearBuild) {
        this.yearBuild = yearBuild;
    }

    public String getCityWhereFind() {
        return cityWhereFind;
    }

    public void setCityWhereFind(String cityWhereFind) {
        this.cityWhereFind = cityWhereFind;
    }   
}
