package ec.edu.espe.ehamanagement.controller;

import ec.edu.espe.EHAManagement.view.PnlReportShortageProducts;
import ec.edu.espe.ehamanagement.model.Product;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Nahir Carrera, Gaman GeekLords, DCC0-ESPE
 */
public class PnlReportShortageProductsController {
    public static void createTableModel(PnlReportShortageProducts reportPanel){
        reportPanel.getTableModel().addColumn("ID");
        reportPanel.getTableModel().addColumn("Name");
        reportPanel.getTableModel().addColumn("Cost");
        reportPanel.getTableModel().addColumn("Quantity");
        reportPanel.getTblTableShortageProductReport().setModel(reportPanel.getTableModel());
        reportPanel.getTblTableShortageProductReport().setEnabled(false);
    }
    public static void refreshTable(PnlReportShortageProducts reportPanel) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        Date date = new Date();
        reportPanel.getLblDate().setText(String.valueOf(dateFormat.format(date)));
        ArrayList <Product> shortageProducts = InventoryReportGenerator.filterProducts(reportPanel.getReadedProducts(), "shortage");
        if(!reportPanel.getReadedProducts().isEmpty()){
            cleanTable(reportPanel);
            createRow(shortageProducts,reportPanel);
        }else{
            JOptionPane.showMessageDialog(reportPanel, "There´s no products in your Inventory", "Empty Inventory", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
     private static void createRow(ArrayList <Product> products, PnlReportShortageProducts reportPanel){
        for(Product product: products){
                String[] information = new String[4];
                information[0]= String.valueOf(product.getId());
                information[1] = product.getName();
                information [2] = String.valueOf(product.getProductionCost());
                information [3] = String.valueOf(product.getQuantity());
                reportPanel.getTableModel().addRow(information);
            }
    }
    private static void cleanTable(PnlReportShortageProducts reportPanel) {
        int row = reportPanel.getTblTableShortageProductReport().getRowCount();
        for (int i = row - 1; i >= 0; i--) {
            reportPanel.getTableModel().removeRow(i);
        }
    }
}
