package ec.edu.espe.AirporTaxiScheduling.model;

/**
 *
 * @author Leonardo Yaranga,Progress Team, DCCO-ESPE
 */
public abstract class Person {

    
    private String name;
    private long phoneNumber;
    private String mail;

    @Override
    public String toString() {
        return "Person{" + "name=" + getName() + ", phoneNumber=" + getPhoneNumber() + ", mail=" + getMail() + '}';
    }
      
    public Person() {
        this.name = "";
        this.phoneNumber = 0;
        this.mail = "";     
    }

    public Person(String name, long phoneNumber, String mail) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.mail = mail;
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

    

}
