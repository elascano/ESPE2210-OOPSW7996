package ec.edu.espe.urbanizationtreasury.controller;

import javax.swing.JComboBox;
import javax.swing.JLabel;

/**
 *
 * @author joela
 */
public class MathOperation {
    
    public void CalculateAmount(JComboBox<String> cbMounthNumber, JLabel lbCalculator) throws NumberFormatException {
        // TODO add your handling code here:
        
        float monthNumber = Integer.parseInt(cbMounthNumber.getSelectedItem().toString());
        float amountpayable = 30;
        amountpayable = multiplicationMonths(amountpayable, monthNumber);
        lbCalculator.setText(Float.toString(amountpayable));
    }

    public float multiplicationMonths(float amountpayable, float monthNumber) {
        amountpayable = amountpayable * monthNumber;
        return amountpayable;
    }
}
