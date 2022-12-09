package ec.edu.espe.Stand.model;
/**
 *
 * @author alejandro Cuadrado
 */
public class Stand {    
    private int id;
    private String name;
    private String owner;

    public Stand(int id, String name, String owner) {
        this.id = id;
        this.name = name;
        this.owner = owner;
    }
  public Stand(){
        this.id = 0;
        this.name = "";
        this.owner ="";
    }
    @Override
    public String toString() {
        return "Stand{" + "id=" + id + ", name=" + name + ", owner=" + owner + '}';
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getname() {
        return name;
    }
    public void setname(String name) {
        this.name = name;
    }
    public String getowner() {
        return owner;
    }
    public void setType(String owner) {
        this.owner = owner;
    }

    public void setStand(Stand stand) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getStand() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    }