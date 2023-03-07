package ec.edu.espe.AirporTaxiScheduling.controller;

import ec.edu.espe.AirporTaxiScheduling.model.PendingTask;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

/**
 *
 * @author Leonardo Yaranga,Progress Team, DCCO-ESPE
 */
public class SubscribedTraveler implements ISubscribedTraveler {

    private String name;
    private String email;

    public SubscribedTraveler(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public void notifyUncollectedTravels(PendingTask pendingTask, Object args) {
        String emailFrom = "progressteam2003@gmail.com";
        String passwordFrom = "qloiyvrvcibqonhc";
        String emailTo;
        String subject;
        String content = "";
        Properties emailProperties;
        Session emailSession;
        MimeMessage emailMessage;
        emailProperties = new Properties();
        subject = "notified observer " + name;
        emailTo = email;
        if (args instanceof Boolean) {
            content = "the payed status of " + " changed to: " + args;
            System.out.println("Mail sended to!"+email);
        } else if (args instanceof Float) {
            content = "The price of " + "changed to: " + args;
            System.out.println("Mail sended to!"+email);

        }

        emailProperties.put("mail.smtp.host", "smtp.gmail.com");
        emailProperties.put("mail.smtp.port", "587");
        emailProperties.put("mail.smtp.auth", "true");
        emailProperties.put("mail.smtp.starttls.enable", "true");

        emailSession = Session.getDefaultInstance(emailProperties, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {

                return new PasswordAuthentication(emailFrom, passwordFrom);

            }
        });
        try {
            emailMessage = new MimeMessage(emailSession);
            emailMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(emailTo, true));
            emailMessage.setSubject(subject);
            emailMessage.setText(content);
            Transport.send(emailMessage);

            JOptionPane.showMessageDialog(null, "Correo enviado");

        } catch (MessagingException me) {
            System.out.println("Exception: " + me);

        }
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

}
