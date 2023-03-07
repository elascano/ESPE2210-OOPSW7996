package ec.edu.espe.ehamanagement.controller;

import ec.edu.espe.ehamanagement.view.FrmLogin;
import ec.edu.espe.ehamanagement.view.FrmPrincipalMenuBar;

import javax.swing.JOptionPane;

/**
 *
 * @author Nahir Carrera, Gaman GeekLords, DCC0-ESPE
 */
public class FrmLoginController {
    
    public static void loginUser(FrmLogin loginFrame){
        String userName = loginFrame.getTxtUserName().getText();
        String password = loginFrame.getPflPassword().getText();
        
        String correctUserName = (String) Profile.getValueFromUser(loginFrame.getUserCollection(), 1, "userName");
        String correctPassword = (String) Profile.getValueFromUser(loginFrame.getUserCollection(), 1, "password");

        if (userName.equals(correctUserName) && password.equals(correctPassword)){
            loginFrame.setVisible(false);
            FrmPrincipalMenuBar frmPrincipalMenuBar = new FrmPrincipalMenuBar();
            frmPrincipalMenuBar.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(loginFrame,"The username or password is incorrect, please try again", "Login Failed", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
}
