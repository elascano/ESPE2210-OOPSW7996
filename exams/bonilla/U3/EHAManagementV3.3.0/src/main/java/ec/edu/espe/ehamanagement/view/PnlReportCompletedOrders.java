package ec.edu.espe.EHAManagement.view;

import com.mongodb.client.MongoCollection;
import ec.edu.espe.ehamanagement.controller.Agenda;
import ec.edu.espe.ehamanagement.controller.AgendaReportGenerator;
import utils.MongoConnection;
import ec.edu.espe.ehamanagement.model.Order;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import static java.awt.print.Printable.PAGE_EXISTS;
import java.awt.print.PrinterException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author NicolayChillo Gaman GeekLords at DCOO-ESPE
 */
public class PnlReportCompletedOrders extends javax.swing.JPanel implements Printable{
    private final MongoConnection mongoConnection;
    private final MongoCollection ordersCollection;
    private final DefaultTableModel model;
    private final  ArrayList <Order> readedOrders ;
    /**
     * Creates new form PnlPrintCompletOrderReport
     */
    public PnlReportCompletedOrders() {
        initComponents();
        mongoConnection = MongoConnection.getInstance();
        ordersCollection = mongoConnection.getCollection("Orders");
        readedOrders = Agenda.readAgenda(ordersCollection);
        model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Client Name");
        model.addColumn("Delivery Date");
        model.addColumn("Delivered");
        this.tblTableCompletedOrdersReport.setModel(model);
        tblTableCompletedOrdersReport.setEnabled(false);
        refreshTable();
    }


    
    private void refreshTable() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        Date date = new Date();
        lblDate.setText(String.valueOf(dateFormat.format(date)));
        ArrayList <Order> completedOrders = AgendaReportGenerator.filterOrders(readedOrders, "completed");
        if(!readedOrders.isEmpty()){
            cleanTable();
            createRow(completedOrders);
        }else{
            JOptionPane.showMessageDialog(this, "There´s no orders in your agenda", "Empty Agenda", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    private void createRow(ArrayList <Order> orders){
        for(Order order: orders){
                String[] information = new String[4];
                information[0]= String.valueOf(order.getId());
                information[1] = order.getClientName();
                information [2] = order.getDeliveryDate();
                information [3] = String.valueOf(order.getIsDelivered());
                model.addRow(information);
            }
    }
    private void cleanTable() {
        int row = tblTableCompletedOrdersReport.getRowCount();
        for (int i = row - 1; i >= 0; i--) {
            model.removeRow(i);
        }
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTableCompletedOrdersReport = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setText("Agenda Report");

        tblTableCompletedOrdersReport.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblTableCompletedOrdersReport.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane2.setViewportView(tblTableCompletedOrdersReport);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Completed Orders Report");

        lblDate.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDate.setText("Date");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(lblDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(358, 358, 358))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 572, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 888, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblDate;
    private javax.swing.JTable tblTableCompletedOrdersReport;
    // End of variables declaration//GEN-END:variables

    @Override
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
        if(pageIndex == 0){
            Graphics2D graphics2d = (Graphics2D) graphics;
            graphics2d.translate(pageFormat.getImageableX(),pageFormat.getImageableY());
            printAll(graphics2d);
            return PAGE_EXISTS;
        }else{
          return NO_SUCH_PAGE;  
        }
    }
}
