
package ec.edu.espe.hw12crudmongodb.model;

/**
 *
 * @author Martín Suquillo, WebMasterTeam, DCCO-ESPE
 */
public class payments {
    private int id;
    private String name;
    private String month;
    private float pay;

    public payments(int id, String name, String month, float pay) {
        this.id = id;
        this.name = name;
        this.month = month;
        this.pay = pay;
    }
    
    @Override
    public String toString() {
        return "Vegetables{" + "id=" + id + ", name=" + name + ", month=" + month + ", pay=" + pay + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public float getPay() {
        return pay;
    }

    public void setPay(float pay) {
        this.pay = pay;
    }


}

