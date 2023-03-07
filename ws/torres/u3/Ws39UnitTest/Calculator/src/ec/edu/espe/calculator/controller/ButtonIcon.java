
package ec.edu.espe.calculator.controller;
import javax.swing.ImageIcon;
import javax.swing.JButton;
/**
 *
 * @author Carlos Torres, T09_PACSTORE, DCCO-ESPE
 */
public class ButtonIcon {
    
    public static void adjustButtonIcon(JButton button) {
        ImageIcon icon = (ImageIcon) button.getIcon();
        int width = button.getWidth();
        int height = button.getHeight();
        icon.setImage(icon.getImage().getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH));
        button.setIcon(icon);
    }
    
    
}
