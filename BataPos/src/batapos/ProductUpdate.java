/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ProductUpdate.java
 *
 * Created on Jan 6, 2013, 10:59:07 AM
 */
package batapos;

import Manager.AddInventory;
import Manager.AddProduct;
import Manager.RemoveInventory;
import Manager.RemoveProduct;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Asadul
 */
public class ProductUpdate extends javax.swing.JFrame {

    /** Creates new form ProductUpdate */
    public ProductUpdate() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pIdTextField = new javax.swing.JTextField();
        pNameTextField = new javax.swing.JTextField();
        pBackButton = new javax.swing.JButton();
        pRemoveButton = new javax.swing.JButton();
        prCancleButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        pIdTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        pAddButton = new javax.swing.JButton();
        paClearButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        sizeComboBox1 = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        catagoryComboBox = new javax.swing.JComboBox();
        pBackButton1 = new javax.swing.JButton();
        prCancleButton1 = new javax.swing.JButton();
        pRemoveButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        sizeComboBox = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        pPriceTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        quantityTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add/Remove Product");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Product Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe Print", 1, 24), new java.awt.Color(255, 0, 51))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 14));
        jLabel1.setText("Product id:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 110, -1));

        jLabel3.setFont(new java.awt.Font("Segoe Print", 1, 14));
        jLabel3.setText("Product size:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));
        jPanel1.add(pIdTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 120, -1));
        jPanel1.add(pNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 120, -1));

        pBackButton.setBackground(new java.awt.Color(102, 153, 255));
        pBackButton.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14));
        pBackButton.setText("Back");
        pBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pBackButtonActionPerformed(evt);
            }
        });
        jPanel1.add(pBackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 330, -1, -1));

        pRemoveButton.setBackground(new java.awt.Color(102, 153, 255));
        pRemoveButton.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14));
        pRemoveButton.setText("Remove");
        pRemoveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pRemoveButtonActionPerformed(evt);
            }
        });
        jPanel1.add(pRemoveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, -1, -1));

        prCancleButton.setBackground(new java.awt.Color(102, 153, 255));
        prCancleButton.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14));
        prCancleButton.setText("Clear");
        prCancleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prCancleButtonActionPerformed(evt);
            }
        });
        jPanel1.add(prCancleButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 390, 10));
        jPanel1.add(pIdTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 120, -1));

        jLabel2.setFont(new java.awt.Font("Segoe Print", 1, 14));
        jLabel2.setText("Product Id:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 110, -1));

        pAddButton.setBackground(new java.awt.Color(102, 153, 255));
        pAddButton.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14));
        pAddButton.setText("Add");
        pAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pAddButtonActionPerformed(evt);
            }
        });
        jPanel1.add(pAddButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, -1, -1));

        paClearButton.setBackground(new java.awt.Color(102, 153, 255));
        paClearButton.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14));
        paClearButton.setText("Clear");
        paClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paClearButtonActionPerformed(evt);
            }
        });
        jPanel1.add(paClearButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe Print", 1, 14));
        jLabel6.setText("Product category:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        sizeComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "18", "20", "22" }));
        jPanel1.add(sizeComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 120, -1));

        jLabel7.setFont(new java.awt.Font("Segoe Print", 1, 14));
        jLabel7.setText("Product name:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        catagoryComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "MEN", "LADIES", "KIDS", " " }));
        jPanel1.add(catagoryComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 120, -1));

        pBackButton1.setBackground(new java.awt.Color(102, 153, 255));
        pBackButton1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14));
        pBackButton1.setText("Back");
        jPanel1.add(pBackButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 330, -1, -1));

        prCancleButton1.setBackground(new java.awt.Color(102, 153, 255));
        prCancleButton1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14));
        prCancleButton1.setText("Clear");
        jPanel1.add(prCancleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, -1, -1));

        pRemoveButton1.setBackground(new java.awt.Color(102, 153, 255));
        pRemoveButton1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14));
        pRemoveButton1.setText("Remove");
        jPanel1.add(pRemoveButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe Print", 1, 14));
        jLabel8.setText("Product size:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        sizeComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "18", "20", "22" }));
        jPanel1.add(sizeComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 120, -1));

        jLabel4.setFont(new java.awt.Font("Segoe Print", 1, 14));
        jLabel4.setText("Product price:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));
        jPanel1.add(pPriceTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 120, -1));

        jLabel9.setFont(new java.awt.Font("Segoe Print", 1, 14));
        jLabel9.setText("Quantity:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));
        jPanel1.add(quantityTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 120, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe Print", 1, 24));
        jLabel5.setText("Add/Remove Product");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(482, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addGap(80, 80, 80))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(423, 423, 423))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(174, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pAddButtonActionPerformed
        // TODO add your handling code here:
        String id = pIdTextField.getText();
        String size = (String) sizeComboBox.getSelectedItem();
        String productId=id+size;
        String productName=pNameTextField.getText();
        String productCategory=(String) catagoryComboBox.getSelectedItem();
        Double price=Double.valueOf(pPriceTextField.getText());
        int quantity = Integer.parseInt(quantityTextField.getText());
        AddProduct aAddProductuct = new AddProduct();
        AddInventory aAddInventory = new AddInventory();
        try {
            if(aAddProductuct.AddnewProduct(productId, productName, productCategory, price)){
                if(aAddInventory.AddNewInventory(productId, quantity)){
                    JOptionPane.showMessageDialog(null, "New Product Added Successfully!!!");
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductUpdate.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_pAddButtonActionPerformed

    private void paClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paClearButtonActionPerformed
        // TODO add your handling code here:
        pIdTextField.setText(null);
        pNameTextField.setText(null);
        pPriceTextField.setText(null);
        quantityTextField.setText(null);
    }//GEN-LAST:event_paClearButtonActionPerformed

    private void pRemoveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pRemoveButtonActionPerformed
        // TODO add your handling code here:
        String id = pIdTextField1.getText();
        String size = (String) sizeComboBox1.getSelectedItem();
        String productId=id+size;
        RemoveProduct aRemoveProduct =new RemoveProduct();
        RemoveInventory aRemoveInventory = new RemoveInventory();
        try {
            if(aRemoveInventory.RemoveSelectedInventory(productId)){
                if(aRemoveProduct.RemoveSelectedProduct(productId)){
                    JOptionPane.showMessageDialog(null, "Product removed successfully");
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductUpdate.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_pRemoveButtonActionPerformed

    private void prCancleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prCancleButtonActionPerformed
        // TODO add your handling code here:
        pIdTextField1.setText(null);
    }//GEN-LAST:event_prCancleButtonActionPerformed

    private void pBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pBackButtonActionPerformed
        // TODO add your handling code here:
        ManagerView aManagerView = new ManagerView();
        this.setVisible(false);
        aManagerView.setVisible(true);
    }//GEN-LAST:event_pBackButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ProductUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new ProductUpdate().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox catagoryComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton pAddButton;
    private javax.swing.JButton pBackButton;
    private javax.swing.JButton pBackButton1;
    private javax.swing.JTextField pIdTextField;
    private javax.swing.JTextField pIdTextField1;
    private javax.swing.JTextField pNameTextField;
    private javax.swing.JTextField pPriceTextField;
    private javax.swing.JButton pRemoveButton;
    private javax.swing.JButton pRemoveButton1;
    private javax.swing.JButton paClearButton;
    private javax.swing.JButton prCancleButton;
    private javax.swing.JButton prCancleButton1;
    private javax.swing.JTextField quantityTextField;
    private javax.swing.JComboBox sizeComboBox;
    private javax.swing.JComboBox sizeComboBox1;
    // End of variables declaration//GEN-END:variables
}