package espe.edu.ec.model;

/**
 *
 * @author NW USER
 */
public class Event {

    private String name;
    private String description;
    private String date;
    private String id;
    private String guest;

    public Event() {
        id = "";
        name = "";
        description = "";
        date = "";
        guest="";
    }

    @Override
    public String toString() {
        return "Event{" + "name=" + name + ", description=" + description + ", date=" + date + ", id=" + id + ", guest=" + guest + '}';
    }

    public Event(String name, String description, String date, String id, String guest) {
        this.name = name;
        this.description = description;
        this.date = date;
        this.id = id;
        this.guest = guest;
    }

    public String getGuest() {
        return guest;
    }

    public void setGuest(String guest) {
        this.guest = guest;
    }
    public Event(String name, String description, String date, String id) {
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
