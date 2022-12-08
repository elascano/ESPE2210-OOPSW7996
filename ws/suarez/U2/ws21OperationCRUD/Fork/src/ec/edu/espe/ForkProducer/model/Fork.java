package ec.edu.espe.ForkProducer.model;

/**
 *
 * @author Matias Suarez,WebMasterTeam,DCCO-ESPE
 */
public class Fork {

    private int id;
    private String MaterialFork;
    private String colorFork;
    private int amountFork;

    public Fork() {
        id = 0;
        MaterialFork = "";
        colorFork = "";
        amountFork = 0;
    }

    @Override
    public String toString() {
        return "Fork{" + "id=" + id + ", MaterialFork=" + MaterialFork + ", colorFork=" + colorFork + ", amountFork=" + amountFork + '}';
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
     * @return the MaterialFork
     */
    public String getMaterialFork() {
        return MaterialFork;
    }

    /**
     * @param MaterialFork the MaterialFork to set
     */
    public void setMaterialFork(String MaterialFork) {
        this.MaterialFork = MaterialFork;
    }

    /**
     * @return the colorFork
     */
    public String getColorFork() {
        return colorFork;
    }

    /**
     * @param colorFork the colorFork to set
     */
    public void setColorFork(String colorFork) {
        this.colorFork = colorFork;
    }

    /**
     * @return the amountFork
     */
    public int getAmountFork() {
        return amountFork;
    }

    /**
     * @param amountFork the amountFork to set
     */
    public void setAmountFork(int amountFork) {
        this.amountFork = amountFork;
    }

}
