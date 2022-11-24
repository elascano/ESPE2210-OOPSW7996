
package fashionstore.model;

/**
 *
 * @author Pythons, DCCO-ESPE
 */
public class Calendar {
    private DeadlineDate deadlineDate;

    @Override
    public String toString() {
        return "Calendar{" + "deadlineDate=" + getDeadlineDate() + '}';
    }

    /**
     * @return the deadlineDate
     */
    public DeadlineDate getDeadlineDate() {
        return deadlineDate;
    }

    /**
     * @param deadlineDate the deadlineDate to set
     */
    public void setDeadlineDate(DeadlineDate deadlineDate) {
        this.deadlineDate = deadlineDate;
    }

    public Calendar(DeadlineDate deadlineDate) {
        this.deadlineDate = deadlineDate;
    }
    
    public Calendar() {
        this.deadlineDate = new DeadlineDate();
    }
        
}
