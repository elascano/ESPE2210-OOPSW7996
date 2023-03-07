package ec.edu.espe.ehamanagement.controller;

import ec.edu.espe.ehamanagement.model.InventoryReport;
import ec.edu.espe.ehamanagement.model.Product;
import ec.edu.espe.ehamanagement.view.FrmPrintShortageProductReport;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Nahir Carrera, Gaman GeekLords, DCC0-ESPE
 */
public class FrmPrintShortageProductReportController {
    public static void insertReport(FrmPrintShortageProductReport reportFrame){
        ArrayList <Product> stockProducts = InventoryReportGenerator.filterProducts(reportFrame.getReadedProducts(), "stock");
        ArrayList <Product> sortageProducts = InventoryReportGenerator.filterProducts(reportFrame.getReadedProducts(), "shortage");
        ArrayList <Integer> stockProductsIds = new ArrayList();
        ArrayList <Integer> shortageProductsIds = new ArrayList();
        for(Product product: stockProducts){
            stockProductsIds.add(product.getId());
        }
        for (Product product:sortageProducts){
            shortageProductsIds.add(product.getId());
        }
        
        InventoryReport newReport = new InventoryReport( stockProductsIds, shortageProductsIds);
        newReport.setType("Shortage Products");
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        Date date = new Date();
        newReport.setDate(String.valueOf(dateFormat.format(date)));
        InventoryReportGenerator.insertReport(reportFrame.getReportsCollection(), newReport);
    }
    
    public static void printReport(FrmPrintShortageProductReport reportFrame){
        PrinterJob job = PrinterJob.getPrinterJob();
        job.setPrintable(reportFrame.getPnlPrintShortageProductReport1());

        if(job.printDialog()){
            try{    
                job.print();
            }catch (PrinterException ex){
            }
        }else{
            JOptionPane.showMessageDialog(reportFrame, "The print was canceled");
        }
    }
}
