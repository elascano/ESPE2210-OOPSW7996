package ec.edu.espe.fork.model;

/**
 *
 * @author Martín Suquillo, WebMasterTeam, DCCO-ESPE
 */
public class Fork {
    private int id;
    private String size;
    private String material;
    
    @Override
    public String toString() {
        return "Fork{" + "id=" + id + ", size=" + size + ", material=" + material + '}';
    }
        public Fork(){
        id =0;
        size ="";
        material ="";
    }

    public Fork(int id, String size, String material) {
        this.id = id;
        this.size = size;
        this.material = material;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Object get(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void add(int i, Fork fork) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
