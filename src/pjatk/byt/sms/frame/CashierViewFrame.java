/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pjatk.byt.sms.frame;


public class CashierViewFrame extends javax.swing.JFrame {

    /**
     * Creates new form CashierViewFrame
     */
    public CashierViewFrame() {
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

        newOperation = new javax.swing.JButton();
        products = new javax.swing.JButton();
        sale = new javax.swing.JButton();
        options = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 500));
        setMinimumSize(new java.awt.Dimension(800, 500));
        setPreferredSize(new java.awt.Dimension(700, 450));
        getContentPane().setLayout(null);

        newOperation.setText("Nowa Operacja");
        newOperation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newOperationActionPerformed(evt);
            }
        });
        getContentPane().add(newOperation);
        newOperation.setBounds(408, 23, 128, 43);

        products.setText("Produkty");
        getContentPane().add(products);
        products.setBounds(408, 77, 128, 42);

        sale.setText("Sprzedaż");
        getContentPane().add(sale);
        sale.setBounds(408, 130, 128, 44);

        options.setText("Opcje");
        getContentPane().add(options);
        options.setBounds(408, 185, 128, 42);

        logout.setText("Wyloguj");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        getContentPane().add(logout);
        logout.setBounds(408, 238, 128, 43);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/backgroundFrame.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 550, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newOperationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newOperationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newOperationActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new LogoutFrame().setVisible(true);
    }//GEN-LAST:event_logoutActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton logout;
    private javax.swing.JButton newOperation;
    private javax.swing.JButton options;
    private javax.swing.JButton products;
    private javax.swing.JButton sale;
    // End of variables declaration//GEN-END:variables
}
