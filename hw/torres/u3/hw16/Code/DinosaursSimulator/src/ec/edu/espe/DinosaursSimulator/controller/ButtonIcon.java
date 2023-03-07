/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.DinosaursSimulator.controller;
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
