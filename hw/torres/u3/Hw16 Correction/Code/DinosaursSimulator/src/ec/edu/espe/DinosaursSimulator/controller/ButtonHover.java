/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.DinosaursSimulator.controller;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author Carlos Torres, T09_PACSTORE, DCCO-ESPE
 */
public class ButtonHover {
    
    private static final int GROW_SIZE = 10;
    public static void hoverGrow(JButton button) {
        Point point = button.getLocation();
        Dimension size = button.getSize();
        ImageIcon icon = (ImageIcon) button.getIcon();
        Image img = icon.getImage();
        Image newimg = img.getScaledInstance(size.width + GROW_SIZE, size.height + GROW_SIZE,  java.awt.Image.SCALE_SMOOTH);
        ImageIcon newIcon = new ImageIcon(newimg);
        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                button.setBounds(point.x - GROW_SIZE/2, point.y - GROW_SIZE/2, size.width + GROW_SIZE, size.height + GROW_SIZE);
                button.setIcon(newIcon);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                button.setBounds(point.x, point.y, size.width, size.height);
                button.setIcon(icon);
            }
        });
    }
    
}

    
    
    
    
    
    
    
    /*private static final int GROW_SIZE = 10;
    private static final int MINIMUN_SIZE = 20;

    public static void hoverGrowEntered(JButton button) {
        Point point = button.getLocation();
        Dimension size = button.getSize();
        ImageIcon icon = (ImageIcon) button.getIcon();
        Image img = icon.getImage();
        Image newimg = img.getScaledInstance(size.width + GROW_SIZE, size.height + GROW_SIZE,  java.awt.Image.SCALE_SMOOTH);
        ImageIcon newIcon = new ImageIcon(newimg);

        button.setBounds(point.x - GROW_SIZE / 2, point.y - GROW_SIZE / 2, size.width + GROW_SIZE, size.height + GROW_SIZE);
        //button.setSize(size.width + GROW_SIZE, size.height + GROW_SIZE);
        //button.setLocation(point);
        button.setIcon(newIcon);
    }

    public static void hoverGrowExit(JButton button) {
        Point point = button.getLocation();
        Dimension size = button.getSize();
        ImageIcon icon = (ImageIcon) button.getIcon();
        Image img = icon.getImage();
        Image newimg = img.getScaledInstance(size.width + GROW_SIZE, size.height + GROW_SIZE,  java.awt.Image.SCALE_SMOOTH);
        ImageIcon newIcon = new ImageIcon(newimg);
        
        button.setBounds(point.x + GROW_SIZE / 2, point.y + GROW_SIZE / 2, size.width - GROW_SIZE, size.height - GROW_SIZE);
        button.setIcon(newIcon);

        //button.setSize(size.width - GROW_SIZE, size.height - GROW_SIZE);
        //button.setLocation(point);
    }

}
*/
   