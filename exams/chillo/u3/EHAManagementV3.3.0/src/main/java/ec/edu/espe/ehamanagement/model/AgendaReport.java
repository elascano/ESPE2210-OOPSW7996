package ec.edu.espe.ehamanagement.model;

import java.util.ArrayList;

/**
 *
 * @author Jairo Bonilla, Gaman GeekLords, DCCO-ESPE
 */
public class AgendaReport extends Report{
    private ArrayList<Integer> pendingOrdersIds;
    private ArrayList<Integer> completedOrdersIds;

    public AgendaReport(ArrayList<Integer> pendingOrdersIds, ArrayList<Integer> completedOrdersIds) {
        this.pendingOrdersIds = pendingOrdersIds;
        this.completedOrdersIds = completedOrdersIds;
    }

    /**
     * @return the pendingOrdersIds
     */
    public ArrayList<Integer> getPendingOrdersIds() {
        return pendingOrdersIds;
    }

    /**
     * @param pendingOrdersIds the pendingOrdersIds to set
     */
    public void setPendingOrdersIds(ArrayList<Integer> pendingOrdersIds) {
        this.pendingOrdersIds = pendingOrdersIds;
    }

    /**
     * @return the completedOrdersLds
     */
    public ArrayList<Integer> getCompletedOrdersIds() {
        return completedOrdersIds;
    }

    /**
     * @param completedOrdersLds the completedOrdersLds to set
     */
    public void setCompletedOrdersIds(ArrayList<Integer> completedOrdersLds) {
        this.completedOrdersIds = completedOrdersLds;
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
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
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
    
}
