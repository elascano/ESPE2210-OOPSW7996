package fashionstore.model;

/**
 *
 * @author Erick Lasluisa, Pythons, DCCO-ESPE
 */
public class DeadlineDate {

    private String deadlineDate;

    @Override
    public String toString() {
        return "DeadlineDate{" + "deadlineDate=" + getDeadlineDate() + '}';
    }

    public DeadlineDate(String deadlineDate) {
        this.deadlineDate = deadlineDate;
    }

    public DeadlineDate() {
        this.deadlineDate = "";
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

}
