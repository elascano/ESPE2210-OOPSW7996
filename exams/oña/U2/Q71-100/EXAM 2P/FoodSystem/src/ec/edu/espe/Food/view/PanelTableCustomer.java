package ec.edu.espe.Food.view;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.Food.model.Customer;
import ec.edu.espe.Food.model.MongoDBConnection;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import org.bson.Document;
import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;

/**
 *
 * @author GiftSoft TEAM, DCCO-ESPE
 */

public class PanelTableCustomer extends javax.swing.JPanel {

    /**
     * Creates new form Panel_tableCustomer
     */
    public PanelTableCustomer() {
        initComponents();
    }
    
public void loadCustomers(){
        
    MongoDBConnection connection;
    connection = new MongoDBConnection();
    connection.connectDatabase();

    CodecRegistry codecRegistry = fromRegistries(MongoClient.getDefaultCodecRegistry(),
            fromProviders(PojoCodecProvider.builder().automatic(true).build()));

    MongoDatabase db = connection.connectDatabase().withCodecRegistry(codecRegistry);
    MongoCollection<Customer> collectionStylists = db.getCollection("Customers", Customer.class); 
    List<Customer> customers = collectionStylists.find(new Document(), Customer.class).into(new ArrayList<>());

    Object[][] objects = new Object[customers.size()][10];

    for (int i = 0; i < customers.size(); i++) {
        objects[i][0] = customers.get(i).getFullNames();
        objects[i][1] = customers.get(i).getSurnames();
        objects[i][5] = customers.get(i).getFood();
        objects[i][6] = customers.get(i).getCost();
        objects[i][7] = customers.get(i).getPaymentMethod();
        table_Customers.setModel(new javax.swing.table.DefaultTableModel(
                objects,
                new String[]{
                    "Full Names", 
                    "Surnames", 
                    "Food",
                    "Cost"
                }
        ));
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_Customers = new javax.swing.JTable();
        lbl_Customers = new javax.swing.JLabel();
        btn_loadCustomers = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(740, 470));
        jPanel1.setPreferredSize(new java.awt.Dimension(740, 470));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table_Customers.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        table_Customers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Full Names", "Surnames", "Food", "Cost"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table_Customers);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 690, 270));

        lbl_Customers.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        lbl_Customers.setText("CUSTOMERS");
        jPanel1.add(lbl_Customers, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, -1));

        btn_loadCustomers.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_loadCustomers.setText("LOAD");
        btn_loadCustomers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_loadCustomersMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_loadCustomersMouseExited(evt);
            }
        });
        btn_loadCustomers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loadCustomersActionPerformed(evt);
            }
        });
        jPanel1.add(btn_loadCustomers, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 350, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 729, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 417, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_loadCustomersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loadCustomersActionPerformed
        loadCustomers();
    }//GEN-LAST:event_btn_loadCustomersActionPerformed

    private void btn_loadCustomersMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_loadCustomersMouseEntered
        btn_loadCustomers.setBackground(Color.green);
    }//GEN-LAST:event_btn_loadCustomersMouseEntered

    private void btn_loadCustomersMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_loadCustomersMouseExited
        btn_loadCustomers.setBackground(Color.cyan);
    }//GEN-LAST:event_btn_loadCustomersMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_loadCustomers;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_Customers;
    private javax.swing.JTable table_Customers;
    // End of variables declaration//GEN-END:variables
}
