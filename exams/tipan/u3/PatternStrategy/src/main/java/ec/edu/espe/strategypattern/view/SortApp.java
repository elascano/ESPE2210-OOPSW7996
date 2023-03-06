package ec.edu.espe.strategypattern.view;

import ec.edu.espe.strategypattern.model.SortingContext;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Random;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

/**
 *
 * @author Reishel Tipan, PACSTORE, DCCO-ESPE
 */
public class SortApp extends Homepage implements ActionListener {
    private JButton button;
    private JLabel label;
    private JTextArea textArea;
    private JScrollPane scrollPane;
    private SortingContext sortingContext;

    public SortApp() {
        sortingContext = new SortingContext();
        
        button = new JButton("Sort");
        button.addActionListener(this);
        
        label = new JLabel("Enter numbers separated by commas:");
        
        textArea = new JTextArea(5, 20);
        scrollPane = new JScrollPane(textArea);
        
        JPanel panel = new JPanel(new BorderLayout());
        panel.add(label, BorderLayout.NORTH);
        panel.add(scrollPane, BorderLayout.CENTER);
        panel.add(button, BorderLayout.SOUTH);
        
        add(panel);
        
        setTitle("Sorting App");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e) {
        String input = textArea.getText();
        String[] tokens = input.split(",");
        int[] data = new int[tokens.length];
        for (int i = 0; i < tokens.length; i++) {
            data[i] = Integer.parseInt(tokens[i].trim());
        }
        sortingContext.sort(data);
        textArea.setText(Arrays.toString(data));
    }
    
    public static void main(String[] args) {
        new SortApp();
    }
}
   
