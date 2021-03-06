/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pjatk.byt.sms.frame;

public class ManagerViewFrame extends javax.swing.JFrame {

    /**
     * Creates new form ManagerViewFrame
     */
    public ManagerViewFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuPanel = new javax.swing.JPanel();
        newOperation = new javax.swing.JButton();
        products = new javax.swing.JButton();
        addProducts = new javax.swing.JButton();
        sale = new javax.swing.JButton();
        options = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(700, 450));
        setPreferredSize(new java.awt.Dimension(700, 450));
        setResizable(false);
        getContentPane().setLayout(null);

        menuPanel.setOpaque(false);

        newOperation.setText("Nowa Operacja");
        newOperation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newOperationActionPerformed(evt);
            }
        });

        products.setText("Produkty");
        products.setMaximumSize(new java.awt.Dimension(107, 23));
        products.setMinimumSize(new java.awt.Dimension(107, 23));
        products.setPreferredSize(new java.awt.Dimension(107, 23));
        products.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productsActionPerformed(evt);
            }
        });

        addProducts.setText("Przyjęcie towaru");
        addProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProductsActionPerformed(evt);
            }
        });

        sale.setText("Sprzedaż");
        sale.setPreferredSize(new java.awt.Dimension(107, 23));
        sale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saleActionPerformed(evt);
            }
        });

        options.setText("Opcje");
        options.setPreferredSize(new java.awt.Dimension(107, 23));
        options.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionsActionPerformed(evt);
            }
        });

        logout.setText("Wyloguj");
        logout.setPreferredSize(new java.awt.Dimension(107, 23));
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuPanelLayout.createSequentialGroup()
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(newOperation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addProducts, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(products, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sale, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(options, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(newOperation, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(products, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(addProducts, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sale, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(options, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(menuPanel);
        menuPanel.setBounds(540, 20, 130, 370);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/backgroundFrame.png"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(836, 449));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-140, -20, 836, 449);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new LogoutFrame().setVisible(true);
    }//GEN-LAST:event_logoutActionPerformed

    private void productsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productsActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new ProductListFrame().setVisible(true);
    }//GEN-LAST:event_productsActionPerformed

    private void saleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saleActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new SaleFrame().setVisible(true);
    }//GEN-LAST:event_saleActionPerformed

    private void optionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionsActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new OptionsFrame().setVisible(true);
    }//GEN-LAST:event_optionsActionPerformed

    private void newOperationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newOperationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newOperationActionPerformed

    private void addProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addProductsActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new AddProducts().setVisible(true);
    }//GEN-LAST:event_addProductsActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addProducts;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton logout;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JButton newOperation;
    private javax.swing.JButton options;
    private javax.swing.JButton products;
    private javax.swing.JButton sale;
    // End of variables declaration//GEN-END:variables
}
