package ec.edu.espe.AirporTaxiScheduling.model;

/**
 *
 * @author Jefferson Ulco,ProgressTeam,DCCO-ESPE
 */
public class Reminder extends Service {

    private String emailTo ;
        private String subject;
    private String content;

    @Override
    public String toString() {
        return "Reminder{" + "emailTo=" + emailTo + ", subject=" + subject + ", content=" + content + '}';
    }

    public Reminder(String emailTo, String subject, String content) {
        this.emailTo = emailTo;
        this.subject = subject;
        this.content = content;
    }

    /**
     * @return the emailTo
     */
    public String getEmailTo() {
        return emailTo;
    }

    /**
     * @param emailTo the emailTo to set
     */
    public void setEmailTo(String emailTo) {
        this.emailTo = emailTo;
    }

    /**
     * @return the subject
     */
    public String getSubject() {
        return subject;
    }

    /**
     * @param subject the subject to set
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * @return the content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content the content to set
     */
    public void setContent(String content) {
        this.content = content;
    }

        
}
