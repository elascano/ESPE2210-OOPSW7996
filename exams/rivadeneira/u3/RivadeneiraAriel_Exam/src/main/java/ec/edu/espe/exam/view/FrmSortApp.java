
package ec.edu.espe.exam.view;


import com.mongodb.client.MongoCollection;
import ec.edu.espe.exam.controller.MongoConnection;
import ec.edu.espe.exam.model.SortingContext;
import java.util.Arrays;
import org.bson.Document;

/**
 *
 * @author Ariel Rivadeneira, Search Engine Bandits, DCCO-ESPE
 */
public class FrmSortApp extends javax.swing.JFrame {
    private int [] numbersToSort;
    private int arrayLength;
     MongoCollection<Document> SortNumber = new MongoConnection().data().getCollection("ListNumbers");
    /**
     * Creates new form FrmSortAppp
     */
    public FrmSortApp() {
        initComponents();
        arrayLength = 1;
        numbersToSort = new int [arrayLength];
        txtAList.setLineWrap(true);
        btnDelete.setEnabled(false);
        btnSort.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNumber = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAList = new javax.swing.JTextArea();
        btnDelete = new javax.swing.JButton();
        btnSort = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtASortedList = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtANotSortedList = new javax.swing.JTextArea();
        txtSort = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtSortType = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtNumber.setToolTipText("Only integer number");
        txtNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumberActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setText("Enter the numbers");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel2.setText("Sort App");

        txtAList.setEditable(false);
        txtAList.setColumns(20);
        txtAList.setFont(new java.awt.Font("DejaVu Serif", 0, 18)); // NOI18N
        txtAList.setRows(5);
        jScrollPane1.setViewportView(txtAList);

        btnDelete.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnSort.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnSort.setText("Sort");
        btnSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortActionPerformed(evt);
            }
        });

        txtASortedList.setEditable(false);
        txtASortedList.setColumns(20);
        txtASortedList.setFont(new java.awt.Font("DejaVu Serif", 0, 14)); // NOI18N
        txtASortedList.setRows(5);
        jScrollPane2.setViewportView(txtASortedList);

        txtANotSortedList.setEditable(false);
        txtANotSortedList.setColumns(20);
        txtANotSortedList.setFont(new java.awt.Font("DejaVu Serif", 0, 14)); // NOI18N
        txtANotSortedList.setRows(5);
        jScrollPane3.setViewportView(txtANotSortedList);

        txtSort.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        txtSort.setText("The sort type is:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel3.setText("List");

        txtSortType.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel4.setText("Ordered list");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel5.setText("Unordered list");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)
                                    .addComponent(txtSort, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSortType, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnDelete)
                                            .addComponent(btnSort, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel3)))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtSort, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSortType, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(btnDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSort)))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void addNumberToList(){
        int numberToAdd;
        numberToAdd = Integer.parseInt(txtNumber.getText());
         
        numbersToSort = Arrays.copyOf(numbersToSort, arrayLength);
        numbersToSort[arrayLength-1] = numberToAdd;
        arrayLength += 1;
        
        txtAList.append("\n" + numberToAdd);
    }
    
    private void deleteNumberFromList(){
        String numbersList = txtAList.getText(); 
        int lastLinesStart = numbersList.lastIndexOf("\n"); 
        if (lastLinesStart >= 0) { 
            int lastLineEnd = numbersList.length(); 
            txtAList.replaceRange("", lastLinesStart, lastLineEnd); 
        }
        
        numbersToSort = Arrays.copyOfRange(numbersToSort, 0, arrayLength - 1);
    }
    
    private void sortList(){
        txtANotSortedList.setText(Arrays.toString(numbersToSort).replace("[", "").replace("]", ""));
        
        SortingContext sortingContext = new SortingContext();
        int sortedList[] = sortingContext.sort(numbersToSort);
        
        txtASortedList.setText(Arrays.toString(sortedList).replace("[", "").replace("]", ""));
    }
    
    private void restartList(){
        arrayLength = 1;
        numbersToSort = new int[arrayLength];
        btnDelete.setEnabled(false);
        btnSort.setEnabled(false);
        txtAList.setText("");
    }
    
    private void changeButtonsStatus(){
        if(arrayLength == 1){
            btnDelete.setEnabled(false);
            btnSort.setEnabled(false);
        }else{
            btnDelete.setEnabled(true);
            btnSort.setEnabled(true);
        }
    }
    
    private void SortingContext (){
        
        arrayLength -= 1;
        
        if(arrayLength >0 && arrayLength<30){
            txtSortType.setText("Bubble Sort");
            Document dataMongo = new org.bson.Document();
            dataMongo.put("Unsorted", txtANotSortedList.getText());
            dataMongo.put("Sort algorithm", "Bubble Sort");
            dataMongo.put("Sorted", txtASortedList.getText());
            SortNumber.insertOne(dataMongo);
            
        }
        
        if(arrayLength >= 30 && arrayLength<100){
            txtSortType.setText("Insertion Sort");
            Document dataMongo = new org.bson.Document();
            dataMongo.put("Unsorted", txtANotSortedList.getText());
            dataMongo.put("Sort algorithm", "Insertion Sort");
            dataMongo.put("Sorted", txtASortedList.getText());
            SortNumber.insertOne(dataMongo);
        }
        
        if (arrayLength >=100){
            txtSortType.setText("Quick Sort");
            Document dataMongo = new org.bson.Document();
            dataMongo.put("Unsorted", txtANotSortedList.getText());
            dataMongo.put("Sort algorithm", "Quick Sort");
            dataMongo.put("Sorted", txtASortedList.getText());
            SortNumber.insertOne(dataMongo);
        }
    
}
    private void clear() {
        txtNumber.setText("");
    }
    
    private void txtNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumberActionPerformed
            txtNumber.getText();
            addNumberToList();
            clear();
            btnDelete.setEnabled(true);
            btnSort.setEnabled(true);
    }//GEN-LAST:event_txtNumberActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        arrayLength -= 1;
        changeButtonsStatus();
        deleteNumberFromList();

    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortActionPerformed
        sortList();
        SortingContext();
        restartList();
        
    }//GEN-LAST:event_btnSortActionPerformed

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
            java.util.logging.Logger.getLogger(FrmSortApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmSortApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmSortApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmSortApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmSortApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSort;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea txtAList;
    private javax.swing.JTextArea txtANotSortedList;
    private javax.swing.JTextArea txtASortedList;
    private javax.swing.JTextField txtNumber;
    private javax.swing.JLabel txtSort;
    private javax.swing.JLabel txtSortType;
    // End of variables declaration//GEN-END:variables
}
