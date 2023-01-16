package ec.espe.edu.Travelers.model;

import java.util.Date;

/**
 *
 * @author Justin Villarroel, ProgressTeam, DCCO-ESPE
 */
public class Traveler {
    private int id;
    private String name;
    private long phoneNumber;
    private String mail;
    private float outstandingBalance;
    private Date birthDate;

    public Traveler(int id, String name, long phoneNumber, String mail, float outstandingBalance, Date birthDate) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.mail = mail;
        this.outstandingBalance = outstandingBalance;
        this.birthDate = birthDate;
    }
    
    public Traveler() {
        this.id = 0;
        this.name = "";
        this.phoneNumber = 0;
        this.mail = "";
        this.outstandingBalance = 0.0F;
        this.birthDate = null;
    }

    @Override
    public String toString() {
        return "Traveler{" + "id=" + id + ", name=" + name + ", phoneNumber=" + phoneNumber + ", mail=" + mail + ", outstandingBalance=" + outstandingBalance + ", birthDate=" + birthDate + '}';
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
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the phoneNumber
     */
    public long getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * @return the mail
     */
    public String getMail() {
        return mail;
    }

    /**
     * @param mail the mail to set
     */
    public void setMail(String mail) {
        this.mail = mail;
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

    /**
     * @return the birthDate
     */
    public Date getBirthDate() {
        return birthDate;
    }

    /**
     * @param birthDate the birthDate to set
     */
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
    
    
}
