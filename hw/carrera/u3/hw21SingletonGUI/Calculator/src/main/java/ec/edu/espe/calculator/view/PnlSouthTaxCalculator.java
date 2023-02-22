package ec.edu.espe.calculator.view;

import ec.edu.espe.calculator.controller.USTax;

/**
 *
 * @author Nahir Carrera, Gaman GeekLords, DCC0-ESPE
 */
public class PnlSouthTaxCalculator extends javax.swing.JPanel {

    /**
     * Creates new form PnlSouthTaxCalculator
     */
    public PnlSouthTaxCalculator() {
        initComponents();
        spnrTax.setValue(4.00F);
    }

    
    private void changeTaxByState(){
        String state;
        
        state = String.valueOf(cbxState.getSelectedItem());
        switch(state){
            case("Alabama")->{spnrTax.setValue(4.00F);}
            case("Arkansas")->{spnrTax.setValue(6.50F);}
            case("Delaware")->{spnrTax.setValue(0.00F);}
            case("Georgia")->{spnrTax.setValue(4.00F);}
            case("Louisiana")->{spnrTax.setValue(4.45F);}
            case("Maryland")->{spnrTax.setValue(6.00F);}
            case("Mississippi")->{spnrTax.setValue(7.00F);}
            case("North Carolina")->{spnrTax.setValue(4.75F);}
            case("Oklahoma")->{spnrTax.setValue(4.5F);}
            case("South Carolina")->{spnrTax.setValue(6.00F);}
            case("Tennessee")->{spnrTax.setValue(7.00F);}
            case("Texas")->{spnrTax.setValue(6.25F);}
            case("Virginia")->{spnrTax.setValue(4.30F);}
            case("West Virginia")->{spnrTax.setValue(6.00F);}
        }
    }
    
    private float computeTax(){
        float taxPercentage;
        float price;
        float salePrice;
        USTax usTax;
        
        taxPercentage = (float) spnrTax.getValue();
        price  = (float) spnrPrice.getValue();
        usTax = USTax.getInstance();
        
        usTax.modifyTaxPercentage(taxPercentage);
        salePrice = usTax.computeSalesTotal(price);
        
        return salePrice;
    }
   
    private void printResult(){
        float salePrice = computeTax();
        lblSalePrice.setText("The sale price is: $ " + salePrice);
        lblTax.setText("Tax: " + spnrTax.getValue() + "%");
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
        cbxState = new javax.swing.JComboBox<>();
        btnResult = new javax.swing.JButton();
        lblSalePrice = new javax.swing.JLabel();
        lblTax = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        spnrTax = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        spnrPrice = new javax.swing.JSpinner();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        cbxState.setBackground(new java.awt.Color(255, 255, 255));
        cbxState.setFont(new java.awt.Font("DejaVu Serif", 0, 14)); // NOI18N
        cbxState.setForeground(new java.awt.Color(187, 187, 188));
        cbxState.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alabama", "Arkansas", "Delaware", "Florida", "Georgia", "Kentucky", "Louisiana", "Maryland", "Mississippi", "Noth Carolina", "Oklahoma", "South Carolina", "Tennessee", "Texas", "Virginia", "West Virginia" }));
        cbxState.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxStateItemStateChanged(evt);
            }
        });

        btnResult.setBackground(new java.awt.Color(246, 211, 227));
        btnResult.setFont(new java.awt.Font("DejaVu Serif", 0, 18)); // NOI18N
        btnResult.setForeground(new java.awt.Color(237, 136, 177));
        btnResult.setText("Apply Sale Tax");
        btnResult.setBorder(null);
        btnResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResultActionPerformed(evt);
            }
        });

        lblSalePrice.setFont(new java.awt.Font("DejaVu Serif", 0, 14)); // NOI18N
        lblSalePrice.setForeground(new java.awt.Color(187, 187, 188));
        lblSalePrice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblTax.setFont(new java.awt.Font("DejaVu Serif", 0, 14)); // NOI18N
        lblTax.setForeground(new java.awt.Color(187, 187, 188));
        lblTax.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel3.setFont(new java.awt.Font("DejaVu Serif", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(187, 187, 188));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("State");

        jLabel4.setFont(new java.awt.Font("DejaVu Serif", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(187, 187, 188));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Tax %");

        spnrTax.setFont(new java.awt.Font("DejaVu Serif", 0, 14)); // NOI18N
        spnrTax.setModel(new javax.swing.SpinnerNumberModel(0.0f, 0.0f, null, 0.01f));

        jLabel5.setFont(new java.awt.Font("DejaVu Serif", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(187, 187, 188));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Price ");

        spnrPrice.setFont(new java.awt.Font("DejaVu Serif", 0, 14)); // NOI18N
        spnrPrice.setModel(new javax.swing.SpinnerNumberModel(0.0f, 0.0f, null, 0.01f));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblSalePrice, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)
                    .addComponent(lblTax, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbxState, javax.swing.GroupLayout.Alignment.LEADING, 0, 161, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(spnrTax)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                            .addComponent(spnrPrice))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbxState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spnrPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spnrTax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(btnResult, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(lblSalePrice, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblTax, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cbxStateItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxStateItemStateChanged
        changeTaxByState();
    }//GEN-LAST:event_cbxStateItemStateChanged

    private void btnResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResultActionPerformed
        printResult();
    }//GEN-LAST:event_btnResultActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnResult;
    private javax.swing.JComboBox<String> cbxState;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblSalePrice;
    private javax.swing.JLabel lblTax;
    private javax.swing.JSpinner spnrPrice;
    private javax.swing.JSpinner spnrTax;
    // End of variables declaration//GEN-END:variables
}
