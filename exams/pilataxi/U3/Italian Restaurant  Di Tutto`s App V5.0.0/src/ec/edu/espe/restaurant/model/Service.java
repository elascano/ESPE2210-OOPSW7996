package ec.edu.espe.restaurant.model;

/**
 *
 * @author GiftSoft TEAM, DCCO-ESPE
 */

public class Service {
    private String food;
    private String cost;
    private String note;
    private String date;
    private String hourOfAttention;
    
    
    public Service(){
    
    }

    public Service(String food, String cost, String note, String date, String hourOfAttention) {
        this.food = food;
        this.cost = cost;
        this.note = note;
        this.date = date;
        this.hourOfAttention = hourOfAttention;
    }

    /**
     * @return the food
     */
    public String getFood() {
        return food;
    }

    /**
     * @param food the food to set
     */
    public void setFood(String food) {
        this.food = food;
    }

    /**
     * @return the cost
     */
    public String getCost() {
        return cost;
    }

    /**
     * @param cost the cost to set
     */
    public void setCost(String cost) {
        this.cost = cost;
    }

    /**
     * @return the note
     */
    public String getNote() {
        return note;
    }

    /**
     * @param note the note to set
     */
    public void setNote(String note) {
        this.note = note;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the hourOfAttention
     */
    public String getHourOfAttention() {
        return hourOfAttention;
    }

    /**
     * @param hourOfAttention the hourOfAttention to set
     */
    public void setHourOfAttention(String hourOfAttention) {
        this.hourOfAttention = hourOfAttention;
    }
    
}
