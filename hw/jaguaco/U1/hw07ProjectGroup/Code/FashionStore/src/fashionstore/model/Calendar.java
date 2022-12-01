
package fashionstore.model;

/**
 *
 * @author Pythons, DCCO-ESPE
 */
public class Calendar {
    private String deadlineDate;

    @Override
    public String toString() {
        return "Calendar{" + "deadlineDate=" + getDeadlineDate() + '}';
    }

    /**
     * @return the deadlineDate
     */
    public String getDeadlineDate() {
        return deadlineDate;
    }

    /**
     * @param deadlineDate the deadlineDate to set
     */
    public void setDeadlineDate(String deadlineDate) {
        this.deadlineDate = deadlineDate;
    }

    public Calendar(String deadlineDate) {
        this.deadlineDate = deadlineDate;
    }
    
    public Calendar() {
        this.deadlineDate = new String();
    }
        
}
