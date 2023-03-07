package ec.edu.espe.restaurant.view;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.restaurant.model.Customer;
import ec.edu.espe.restaurant.controller.MongoDBConnection;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.RowSorter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import org.bson.Document;
import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;

/**
 *
 * @author GiftSoft TEAM, DCCO-ESPE
 */

public class PanelTableOrder extends javax.swing.JPanel {


    public PanelTableOrder() {
        initComponents();
    }
    public void sortListCustomer(){
        DefaultTableModel tablaPedidos = (DefaultTableModel) this.table_Customers.getModel();
        RowSorter<TableModel> sorter = new TableRowSorter<TableModel>(tablaPedidos);
        table_Customers.setRowSorter(sorter);
        table_Customers.getRowSorter().toggleSortOrder(8);
    }
    
public void loadCustomers(){
        
    MongoDBConnection.connectDatabase();

    CodecRegistry codecRegistry = fromRegistries(MongoClient.getDefaultCodecRegistry(),fromProviders(PojoCodecProvider.builder().automatic(true).build()));
    MongoDatabase db = MongoDBConnection.connectDatabase().withCodecRegistry(codecRegistry);
    MongoCollection<Customer> collectionCustomer = db.getCollection("Orders", Customer.class); 
    List<Customer> customers = collectionCustomer.find(new Document(), Customer.class).into(new ArrayList<>());

    Object[][] objects = new Object[customers.size()][10];

    for (int i = 0; i < customers.size(); i++) {
        objects[i][0] = customers.get(i).getFirstName();
        objects[i][1] = customers.get(i).getLastName();
        objects[i][2] = customers.get(i).getIdentification();
        objects[i][3] = customers.get(i).getCellphone();
        objects[i][4] = customers.get(i).getEmail();
        objects[i][5] = customers.get(i).getFood();
        objects[i][6] = customers.get(i).getCost();
        objects[i][7] = customers.get(i).getNote();
        objects[i][8] = customers.get(i).getDate();
        objects[i][9] = customers.get(i).getHourOfAttention();

        table_Customers.setModel(new javax.swing.table.DefaultTableModel(
                objects,
                new String[]{
                    "Names", 
                    "Surnames", 
                    "C.I.", 
                    "Cellphone", 
                    "E-mail",
                    "Food",
                    "Cost",
                    "Note",
                    "Date",
                    "Hour"
                }
        ));
    } 
    sortListCustomer();
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_Customers = new javax.swing.JTable();
        lbl_Customers = new javax.swing.JLabel();
        btn_loadCustomers = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(900, 550));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 550));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table_Customers.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 255, 204), new java.awt.Color(153, 255, 204), new java.awt.Color(255, 255, 0), new java.awt.Color(0, 153, 153)));
        table_Customers.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        table_Customers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Names", "Surnames", "C.I.", "Cellphone", "Email", "Food", "Cost", "Date", "Hour"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table_Customers);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 710, 290));

        lbl_Customers.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        lbl_Customers.setForeground(new java.awt.Color(0, 0, 0));
        lbl_Customers.setText("LIST OF ORDERS");
        jPanel1.add(lbl_Customers, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, -1));

        btn_loadCustomers.setBackground(new java.awt.Color(102, 255, 102));
        btn_loadCustomers.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        btn_loadCustomers.setForeground(new java.awt.Color(0, 0, 0));
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
        jPanel1.add(btn_loadCustomers, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 390, -1, -1));

        jPanel2.setBackground(new java.awt.Color(102, 255, 102));
        jPanel2.setForeground(new java.awt.Color(102, 255, 102));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_Customers;
    private javax.swing.JTable table_Customers;
    // End of variables declaration//GEN-END:variables
}
