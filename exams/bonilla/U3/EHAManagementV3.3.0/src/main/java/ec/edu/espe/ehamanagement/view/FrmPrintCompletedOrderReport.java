package ec.edu.espe.ehamanagement.view;

import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialLighterIJTheme;
import com.mongodb.client.MongoCollection;
import ec.edu.espe.ehamanagement.controller.Agenda;
import ec.edu.espe.ehamanagement.controller.AgendaReportGenerator;
import ec.edu.espe.ehamanagement.model.AgendaReport;
import utils.MongoConnection;
import ec.edu.espe.ehamanagement.model.Order;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author NicolayChillo Gaman GeekLords at DCOO-ESPE
 */
public class FrmPrintCompletedOrderReport extends javax.swing.JFrame {
    private final MongoConnection mongoConnection;
    private final MongoCollection ordersCollection;
    private final MongoCollection reportsCollection;
    private final  ArrayList <Order> readedOrders ;
    /**
     * Creates new form FrmPrintCompletedOrderReport
     */
    public FrmPrintCompletedOrderReport() {
        mongoConnection = MongoConnection.getInstance();
        ordersCollection = mongoConnection.getCollection("Orders");
        reportsCollection = mongoConnection.getCollection("Reports");
        readedOrders = Agenda.readAgenda(ordersCollection);
        initComponents();
        
    }
    private void insertReport(){
        ArrayList <Order> completedOrders = AgendaReportGenerator.filterOrders(readedOrders, "completed");
        ArrayList <Order> pendingOrders = AgendaReportGenerator.filterOrders(readedOrders, "pending");
        ArrayList <Integer> completedOrdersIds = new ArrayList();
        ArrayList <Integer> pendingOrdersIds = new ArrayList();
        for(Order order: completedOrders){
            completedOrdersIds.add(order.getId());
        }
        for (Order order:pendingOrders){
            pendingOrdersIds.add(order.getId());
        }
        
        AgendaReport newReport = new AgendaReport(pendingOrdersIds, completedOrdersIds);
        newReport.setType("Completed Orders");
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        Date date = new Date();
        newReport.setDate(String.valueOf(dateFormat.format(date)));
        AgendaReportGenerator.insertReport(reportsCollection, newReport);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrintCompletedOrderReport1 = new ec.edu.espe.EHAManagement.view.PnlReportCompletedOrders();
        jPanel1 = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        btnPrint = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnPrint.setText("Print");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnPrint)
                .addGap(127, 127, 127))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPrint)
                    .addComponent(btnBack))
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlPrintCompletedOrderReport1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(pnlPrintCompletedOrderReport1, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        insertReport();
        PrinterJob job = PrinterJob.getPrinterJob();

        job.setPrintable(pnlPrintCompletedOrderReport1);

        if(job.printDialog()){
            try{
                job.print();
            }catch (PrinterException ex){
            }
        }else{
            JOptionPane.showMessageDialog(this, "The print was canceled");
        }
    }//GEN-LAST:event_btnPrintActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        FrmPrincipalMenuBar open = new FrmPrincipalMenuBar();
        open.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        FlatMaterialLighterIJTheme.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrintCompletedOrderReport().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnPrint;
    private javax.swing.JPanel jPanel1;
    private ec.edu.espe.EHAManagement.view.PnlReportCompletedOrders pnlPrintCompletedOrderReport1;
    // End of variables declaration//GEN-END:variables
}
