
package ec.edu.espe.AirportTaxiScheduling.model;

/**
 *
 * @author ProgressTeam,DCCO-ESPE
 */
public class Traveler {
    
   private String name;
   private String adress;
   private long phoneNumber;
   private String email;
   private String birthDate;

    @Override
    public String toString() {
        return "Traveler" + "\n name=" + name + "\n adress=" + adress + "\n phoneNumber=" + phoneNumber + "\n email=" + email + "\n birthDate=" + birthDate;
    }

   public Traveler(){
       name="";
       adress="";
       phoneNumber=0;
       email="";
       birthDate="";
   }

    public Traveler(String name, String adress, long phoneNumber, String email, String birthDate) {
        this.name = name;
        this.adress = adress;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.birthDate = birthDate;
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
     * @return the adress
     */
    public String getAdress() {
        return adress;
    }

    /**
     * @param adress the adress to set
     */
    public void setAdress(String adress) {
        this.adress = adress;
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
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the birthDate
     */
    public String getBirthDate() {
        return birthDate;
    }

    /**
     * @param birthDate the birthDate to set
     */
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
   
           
}
