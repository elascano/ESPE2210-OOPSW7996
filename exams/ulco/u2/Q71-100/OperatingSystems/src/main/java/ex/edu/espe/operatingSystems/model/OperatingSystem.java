/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex.edu.espe.operatingSystems.model;

/**
 *
 * @author Labs-DCCO
 */
public class OperatingSystem {
    private String id;
    private String name;
    private String version;
    private String year;

    @Override
    public String toString() {
        return "OperatingSystems{" + "id=" + id + ", name=" + name + ", version=" + version + ", year=" + year + '}';
    }

   

    public OperatingSystem(String id, String name, String version, String year) {
        this.id = id;
        this.name = name;
        this.version = version;
        this.year = year;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
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
     * @return the version
     */
    public String getVersion() {
        return version;
    }

    /**
     * @param version the version to set
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * @return the year
     */
    public String getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(String year) {
        this.year = year;
    }

}