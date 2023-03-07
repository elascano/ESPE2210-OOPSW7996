package ec.edu.espe.restaurant.view;

import ec.edu.espe.restaurant.controller.CustomerController;
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

    public FrmInterface() {
        initComponents();
        this.setTitle("Italian Restaurant Di Tutto`s");
        setIconImage(getIconImage());
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        PanelHome panelH;
        panelH = new PanelHome();
        showPanel(panelH);
    }
    @Override
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Images/icono.png"));
        return retValue;
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
        Panel_Exit = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Panel_Customers = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Panel_HomeSchedule = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Panel_Schedule = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Panel_Update = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Panel_Delete = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

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
            .addGap(0, 500, Short.MAX_VALUE)
        );

        jPanel1.add(panel_allData, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 740, 500));
        panel_allData.getAccessibleContext().setAccessibleName("");

        Panel_Exit.setBackground(new java.awt.Color(255, 255, 255));
        Panel_Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Panel_ExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Panel_ExitMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Panel_ExitMousePressed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("EXIT");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/exit1.png"))); // NOI18N

        javax.swing.GroupLayout Panel_ExitLayout = new javax.swing.GroupLayout(Panel_Exit);
        Panel_Exit.setLayout(Panel_ExitLayout);
        Panel_ExitLayout.setHorizontalGroup(
            Panel_ExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_ExitLayout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addGap(67, 67, 67))
        );
        Panel_ExitLayout.setVerticalGroup(
            Panel_ExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_ExitLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(Panel_ExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel1.add(Panel_Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 170, -1));

        Panel_Customers.setBackground(new java.awt.Color(255, 255, 255));
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
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("LIST OF ORDERS");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/customer1.png"))); // NOI18N

        javax.swing.GroupLayout Panel_CustomersLayout = new javax.swing.GroupLayout(Panel_Customers);
        Panel_Customers.setLayout(Panel_CustomersLayout);
        Panel_CustomersLayout.setHorizontalGroup(
            Panel_CustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_CustomersLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addContainerGap(11, Short.MAX_VALUE))
        );
        Panel_CustomersLayout.setVerticalGroup(
            Panel_CustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_CustomersLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel8)
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_CustomersLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(Panel_Customers, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 170, 70));

        Panel_HomeSchedule.setBackground(new java.awt.Color(255, 255, 255));
        Panel_HomeSchedule.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Panel_HomeScheduleMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Panel_HomeScheduleMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Panel_HomeScheduleMousePressed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("HOME");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/home1.png"))); // NOI18N

        javax.swing.GroupLayout Panel_HomeScheduleLayout = new javax.swing.GroupLayout(Panel_HomeSchedule);
        Panel_HomeSchedule.setLayout(Panel_HomeScheduleLayout);
        Panel_HomeScheduleLayout.setHorizontalGroup(
            Panel_HomeScheduleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_HomeScheduleLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addContainerGap(57, Short.MAX_VALUE))
        );
        Panel_HomeScheduleLayout.setVerticalGroup(
            Panel_HomeScheduleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_HomeScheduleLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(Panel_HomeScheduleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel12))
                .addGap(28, 28, 28))
        );

        jPanel1.add(Panel_HomeSchedule, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 170, 70));

        Panel_Schedule.setBackground(new java.awt.Color(255, 255, 255));
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
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("REGISTER ORDER");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/AGENDAR.png"))); // NOI18N

        javax.swing.GroupLayout Panel_ScheduleLayout = new javax.swing.GroupLayout(Panel_Schedule);
        Panel_Schedule.setLayout(Panel_ScheduleLayout);
        Panel_ScheduleLayout.setHorizontalGroup(
            Panel_ScheduleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_ScheduleLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(60, 60, 60))
        );
        Panel_ScheduleLayout.setVerticalGroup(
            Panel_ScheduleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_ScheduleLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(Panel_ScheduleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel1.add(Panel_Schedule, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 170, 70));

        Panel_Update.setBackground(new java.awt.Color(255, 255, 255));
        Panel_Update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Panel_UpdateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Panel_UpdateMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Panel_UpdateMousePressed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("UPDATE ORDER");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/actualizar1_1.png"))); // NOI18N

        javax.swing.GroupLayout Panel_UpdateLayout = new javax.swing.GroupLayout(Panel_Update);
        Panel_Update.setLayout(Panel_UpdateLayout);
        Panel_UpdateLayout.setHorizontalGroup(
            Panel_UpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_UpdateLayout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addGap(12, 12, 12))
        );
        Panel_UpdateLayout.setVerticalGroup(
            Panel_UpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_UpdateLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(Panel_UpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel1.add(Panel_Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 170, 70));

        Panel_Delete.setBackground(new java.awt.Color(255, 255, 255));
        Panel_Delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Panel_DeleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Panel_DeleteMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Panel_DeleteMousePressed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("DELETE ORDER");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/delete1.png"))); // NOI18N

        javax.swing.GroupLayout Panel_DeleteLayout = new javax.swing.GroupLayout(Panel_Delete);
        Panel_Delete.setLayout(Panel_DeleteLayout);
        Panel_DeleteLayout.setHorizontalGroup(
            Panel_DeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_DeleteLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addGap(14, 14, 14))
        );
        Panel_DeleteLayout.setVerticalGroup(
            Panel_DeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_DeleteLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(Panel_DeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel1.add(Panel_Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 170, 70));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logoInteface.png"))); // NOI18N
        jLabel9.setText("jLabel9");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 150, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void Panel_CustomersMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_CustomersMouseEntered
        Panel_Customers.setBackground(Color.red);
    }//GEN-LAST:event_Panel_CustomersMouseEntered

    private void Panel_CustomersMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_CustomersMouseExited
        Panel_Customers.setBackground(Color.white);
    }//GEN-LAST:event_Panel_CustomersMouseExited

    private void Panel_ExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_ExitMouseEntered
        Panel_Exit.setBackground(Color.red);
    }//GEN-LAST:event_Panel_ExitMouseEntered

    private void Panel_ExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_ExitMouseExited
        Panel_Exit.setBackground(Color.white);
    }//GEN-LAST:event_Panel_ExitMouseExited

    private void Panel_ExitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_ExitMousePressed
        
      int i =  JOptionPane.showConfirmDialog(this,"Do you want to leave the program?","Warning",JOptionPane.WARNING_MESSAGE);
        
      if(i==0){
        FrmLogin FrmII;
        FrmII = new FrmLogin();
        
        FrmII.setVisible(true);
        this.setVisible(false);
      }else if(i==1){
          this.setVisible(true);
      }
    }//GEN-LAST:event_Panel_ExitMousePressed
    
    private void Panel_CustomersMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_CustomersMousePressed
        PanelTableOrder panelTC;
        panelTC = new PanelTableOrder();
        showPanel(panelTC);
    }//GEN-LAST:event_Panel_CustomersMousePressed

    private void Panel_HomeScheduleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_HomeScheduleMouseEntered
        Panel_HomeSchedule.setBackground(Color.red);
    }//GEN-LAST:event_Panel_HomeScheduleMouseEntered

    private void Panel_HomeScheduleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_HomeScheduleMouseExited
        Panel_HomeSchedule.setBackground(Color.white);
    }//GEN-LAST:event_Panel_HomeScheduleMouseExited

    private void Panel_HomeScheduleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_HomeScheduleMousePressed
        PanelHome panelH;
        panelH = new PanelHome();
        
        showPanel(panelH);
    }//GEN-LAST:event_Panel_HomeScheduleMousePressed

    private void Panel_DeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_DeleteMouseEntered
        Panel_Delete.setBackground(Color.red);
    }//GEN-LAST:event_Panel_DeleteMouseEntered

    private void Panel_DeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_DeleteMouseExited
        Panel_Delete.setBackground(Color.white);
    }//GEN-LAST:event_Panel_DeleteMouseExited

    private void Panel_DeleteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_DeleteMousePressed
        PanelDeleteOrder panelDelete;
        panelDelete = new PanelDeleteOrder();
                
        showPanel(panelDelete);
    }//GEN-LAST:event_Panel_DeleteMousePressed

    private void Panel_UpdateMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_UpdateMousePressed
        PanelUpdateOrder panelUC;
        panelUC = new PanelUpdateOrder();

        showPanel(panelUC);
    }//GEN-LAST:event_Panel_UpdateMousePressed

    private void Panel_UpdateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_UpdateMouseExited
        Panel_Update.setBackground(Color.white);
    }//GEN-LAST:event_Panel_UpdateMouseExited

    private void Panel_UpdateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_UpdateMouseEntered
        Panel_Update.setBackground(Color.red);
    }//GEN-LAST:event_Panel_UpdateMouseEntered

    private void Panel_ScheduleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_ScheduleMousePressed
        PanelRegisterOrder panelAD;

        panelAD = new PanelRegisterOrder();
        showPanel(panelAD);
    }//GEN-LAST:event_Panel_ScheduleMousePressed

    private void Panel_ScheduleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_ScheduleMouseExited
        Panel_Schedule.setBackground(Color.white);
    }//GEN-LAST:event_Panel_ScheduleMouseExited

    private void Panel_ScheduleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_ScheduleMouseEntered
        Panel_Schedule.setBackground(Color.red);
    }//GEN-LAST:event_Panel_ScheduleMouseEntered

 
    public static void main(String args[]) {
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel_Customers;
    private javax.swing.JPanel Panel_Delete;
    private javax.swing.JPanel Panel_Exit;
    private javax.swing.JPanel Panel_HomeSchedule;
    private javax.swing.JPanel Panel_Schedule;
    private javax.swing.JPanel Panel_Update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panel_allData;
    // End of variables declaration//GEN-END:variables
}
