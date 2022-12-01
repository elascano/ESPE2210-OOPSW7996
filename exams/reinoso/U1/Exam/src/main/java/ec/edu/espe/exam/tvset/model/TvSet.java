package ec.edu.espe.exam.tvset.model;

/**
 *
 * @author Jerly Reinoso, Search Engine Bandits, DCCO-ESPE
 */
public class TvSet {
    private int id;
    private String namebrand;
    private String color;

     @Override
    public String toString() {
        return "TvSet{" + "id=" + id + ", namebrand=" + namebrand + ", color=" + color + '}';
    }
              
    public TvSet(){
        id = 0;
        namebrand = "";
        color = "";
    }

    public TvSet(int id, String namebrand, String color) {
        this.id = id;
        this.namebrand = namebrand;
        this.color = color;
    }
            
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }

    /**
     * @return the namebrand
     */
    public String getNamebrand() {
        return namebrand;
    }

    /**
     * @param namebrand the name to set
     */
    public void setNamebrand(String namebrand) {
        this.namebrand = namebrand;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }
    
    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }
  }
