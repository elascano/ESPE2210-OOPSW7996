package espe.edu.ec.model;

/**
 *
 * @author Karla Ansatuña
 */

public class CanceledEvent {
 private String name;
   private String description;
   private String date;
   private int id;
public CanceledEvent() {
        id = 0;
        name = "";
        description = "";
        date = "";
    }
    @Override
    public String toString() {
        return "Event{" + "name=" + name + ", description=" + description + ", date=" + date + ", id=" + id + '}';
    }

    public CanceledEvent(String name, String description, String date, int id) {
        this.name = name;
        this.description = description;
        this.date = date;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
       
}
