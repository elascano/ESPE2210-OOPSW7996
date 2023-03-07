
package ec.edu.espe.fashionstore.model;

/**
 *
 * @author Pythons, DCCO-ESPE
 */
public class Calendar {

    private int dayDeadlineDate;
    private int monthDeadlineDate;
    private int yearDeadlineDate;

    @Override
    public String toString() {
        return "Calendar{" + "deadlineDate:\n" + "Day = \t" + getDay() + "Month = \t" + getMonth() + "Year = \t" + getYear() + '}';
    }
public Calendar(int day, int month, int year){
    this.dayDeadlineDate = day;
    this.monthDeadlineDate = month;
    this.yearDeadlineDate = year;
    
}

public Calendar(){
    this.dayDeadlineDate = 0;
    this.monthDeadlineDate = 0;
    this.yearDeadlineDate = 0;
}
    
 /**
     * @return the day
     */
    public int getDay() {
        return dayDeadlineDate;
    }

    /**
     * @param day the day to set
     */
    public void setDay(int day) {
        this.dayDeadlineDate = day;
    }

    /**
     * @return the month
     */
    public int getMonth() {
        return monthDeadlineDate;
    }

    /**
     * @param month the month to set
     */
    public void setMonth(int month) {
        this.monthDeadlineDate = month;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return yearDeadlineDate;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.yearDeadlineDate = year;
    }
        
}
