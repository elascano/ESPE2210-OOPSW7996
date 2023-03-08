package ec.edu.espe.apanadossystem.model;

/**
 *
 * @author Christopher Bazurto, DeltaTeam, DCCO-ESPE
 */
public class ContactEmail {

    private String emailContact;
    private String nameContact;
    private String messageContact;

    @Override
    public String toString() {
        return "ContactEmail{" + "emailContact=" + emailContact + ", nameContact=" + nameContact + ", messageContact=" + messageContact + '}';
    }

    public ContactEmail(String emailContact, String nameContact, String messageContact) {
        this.emailContact = emailContact;
        this.nameContact = nameContact;
        this.messageContact = messageContact;
    }

    /**
     * @return the emailContact
     */
    public String getEmailContact() {
        return emailContact;
    }

    /**
     * @param emailContact the emailContact to set
     */
    public void setEmailContact(String emailContact) {
        this.emailContact = emailContact;
    }

    /**
     * @return the nameContact
     */
    public String getNameContact() {
        return nameContact;
    }

    /**
     * @param nameContact the nameContact to set
     */
    public void setNameContact(String nameContact) {
        this.nameContact = nameContact;
    }

    /**
     * @return the messageContact
     */
    public String getMessageContact() {
        return messageContact;
    }

    /**
     * @param messageContact the messageContact to set
     */
    public void setMessageContact(String messageContact) {
        this.messageContact = messageContact;
    }

}
