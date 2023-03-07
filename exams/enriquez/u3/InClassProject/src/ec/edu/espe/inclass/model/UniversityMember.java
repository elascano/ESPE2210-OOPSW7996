package ec.edu.espe.inclass.model;

/**
 *
 * @author Alejandro Cuadrado, Developer Bears, DCCO-ESPE
 * @author Alexander Guaman, Developer Bears, DCCO-ESPE
 * @author Sheylee Enriquez, Developer Bears, DCCO-ESPE
 * @author Stephen Drouet, Developer Bears, DCCO-ESPE
 */
public abstract class UniversityMember {

    private String name;
    private String espeId;

    public UniversityMember(String name, String espeId) {
        this.name = name;
        this.espeId = espeId;
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
     * @return the espeId
     */
    public String getEspeId() {
        return espeId;
    }

    /**
     * @param espeId the espeId to set
     */
    public void setEspeId(String espeId) {
        this.espeId = espeId;
    }

}
