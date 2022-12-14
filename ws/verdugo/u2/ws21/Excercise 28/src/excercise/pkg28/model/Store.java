/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excercise.pkg28.model;
/**
 *
 * @author Sebastian Verdugo, ProgressTeam, DCCO-ESPE
 */
public class Store {
    private String name;
    private int id;
    private String localName;
    
    public Store(String name, int id, String localName) {
        this.name = name;
        this.id = id;
        this.localName = localName;
    }
    
    public Store() {
        this.name = "";
        this.id = 0;
        this.localName = "";
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
     * @return the type
     */
    public String getlocalName() {
        return localName;
    }

    /**
     * @param localName the type to set
     */
    public void setlocalName(String localName) {
        this.localName = localName;
    }
}    
    

