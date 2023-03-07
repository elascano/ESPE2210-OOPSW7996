package ec.edu.espe.AirporTaxiScheduling.model;

/**
 *
 * @author Justin Villarroel, ProgressTeam, DCCO-ESPE
 */
public class Traveler extends Person {

    private int id;
    private float outstandingBalance;
    private int birthdayDay;
    private int birthdayMonth;
    private int year;

    @Override
    public String toString() {
        return "Traveler{" + "id=" + getId() + super.toString() + ", outstandingBalance=" + getOutstandingBalance() + ", birthdayDay=" + getBirthdayDay() + ", birthdayMonth=" + getBirthdayMonth() + ", year=" + getYear() + '}';
    }

    public Traveler(int id, String name, long phoneNumber, String mail, float outstandingBalance, int birthdayDay, int birthdayMonth, int year) {
        super(name, phoneNumber, mail);
        this.id = id;
        this.outstandingBalance = outstandingBalance;
        this.birthdayDay = birthdayDay;
        this.birthdayMonth = birthdayMonth;
        this.year = year;
    }

    public Traveler() {
        super("", 0, "");
        this.id = 0;
        this.outstandingBalance = 0.0F;
        this.birthdayDay = 1;
        this.birthdayMonth = 1;
        this.year = 1900;
    }

    /**
     * @return the birthdayDay
     */
    public int getBirthdayDay() {
        return birthdayDay;
    }

    /**
     * @param birthdayDay the birthdayDay to set
     */
    public void setBirthdayDay(int birthdayDay) {
        this.birthdayDay = birthdayDay;
    }

    /**
     * @return the birthdayMonth
     */
    public int getBirthdayMonth() {
        return birthdayMonth;
    }

    /**
     * @param birthdayMonth the birthdayMonth to set
     */
    public void setBirthdayMonth(int birthdayMonth) {
        this.birthdayMonth = birthdayMonth;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
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
     * @return the outstandingBalance
     */
    public float getOutstandingBalance() {
        return outstandingBalance;
    }

    /**
     * @param outstandingBalance the outstandingBalance to set
     */
    public void setOutstandingBalance(float outstandingBalance) {
        this.outstandingBalance = outstandingBalance;
    }

}
