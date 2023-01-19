package ec.edu.espe.Food.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author GiftSoft TEAM, DCCO-ESPE
 */

public class FrmInterface extends javax.swing.JFrame {

    /**
     * Creates new form Frm_InterfaceSchedule
     */
    public FrmInterface() {
        initComponents();
        this.setTitle("IExam");
        setIconImage(getIconImage());
        this.setLocationRelativeTo(null);
        this.setResizable(false);
      
    }
   
    private void showPanel(JPanel p){
        p.setSize(900,550);
        p.setLocation(0,0);
        
        panel_allData.removeAll();
        panel_allData.add(p,BorderLayout.CENTER);
        panel_allData.revalidate();
        panel_allData.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panel_allData = new javax.swing.JPanel();
        Panel_Customers = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        Panel_Schedule = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_allData.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panel_allDataLayout = new javax.swing.GroupLayout(panel_allData);
        panel_allData.setLayout(panel_allDataLayout);
        panel_allDataLayout.setHorizontalGroup(
            panel_allDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 740, Short.MAX_VALUE)
        );
        panel_allDataLayout.setVerticalGroup(
            panel_allDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );

        jPanel1.add(panel_allData, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 740, 460));

        Panel_Customers.setBackground(new java.awt.Color(204, 204, 204));
        Panel_Customers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Panel_CustomersMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Panel_CustomersMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Panel_CustomersMousePressed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel8.setText("LIST CUSTOMERS");

        javax.swing.GroupLayout Panel_CustomersLayout = new javax.swing.GroupLayout(Panel_Customers);
        Panel_Customers.setLayout(Panel_CustomersLayout);
        Panel_CustomersLayout.setHorizontalGroup(
            Panel_CustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_CustomersLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel8)
                .addContainerGap(11, Short.MAX_VALUE))
        );
        Panel_CustomersLayout.setVerticalGroup(
            Panel_CustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_CustomersLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel1.add(Panel_Customers, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 160, 60));

        Panel_Schedule.setBackground(new java.awt.Color(204, 204, 204));
        Panel_Schedule.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Panel_ScheduleMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Panel_ScheduleMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Panel_ScheduleMousePressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel5.setText("REGISTER");

        javax.swing.GroupLayout Panel_ScheduleLayout = new javax.swing.GroupLayout(Panel_Schedule);
        Panel_Schedule.setLayout(Panel_ScheduleLayout);
        Panel_ScheduleLayout.setHorizontalGroup(
            Panel_ScheduleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_ScheduleLayout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(40, 40, 40))
        );
        Panel_ScheduleLayout.setVerticalGroup(
            Panel_ScheduleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_ScheduleLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(16, 16, 16))
        );

        jPanel1.add(Panel_Schedule, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 160, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void Panel_ScheduleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_ScheduleMousePressed
        PanelRegisterCustomer panelAD;
        panelAD = new PanelRegisterCustomer();
        showPanel(panelAD);
    }//GEN-LAST:event_Panel_ScheduleMousePressed

    private void Panel_ScheduleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_ScheduleMouseEntered
        Panel_Schedule.setBackground(Color.white);
    }//GEN-LAST:event_Panel_ScheduleMouseEntered

    private void Panel_ScheduleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_ScheduleMouseExited
        Panel_Schedule.setBackground(Color.lightGray);
    }//GEN-LAST:event_Panel_ScheduleMouseExited

    private void Panel_CustomersMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_CustomersMouseEntered
        Panel_Customers.setBackground(Color.white);
    }//GEN-LAST:event_Panel_CustomersMouseEntered

    private void Panel_CustomersMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_CustomersMouseExited
        Panel_Customers.setBackground(Color.lightGray);
    }//GEN-LAST:event_Panel_CustomersMouseExited

    private void Panel_CustomersMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_CustomersMousePressed
        PanelTableCustomer panelTC;
        panelTC = new PanelTableCustomer();
        showPanel(panelTC);
    }//GEN-LAST:event_Panel_CustomersMousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel_Customers;
    private javax.swing.JPanel Panel_Schedule;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panel_allData;
    // End of variables declaration//GEN-END:variables
}
