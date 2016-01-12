/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pjatk.byt.sms.frame;

import pjatk.byt.sms.authentication.AuthenticationManager;
import pjatk.byt.sms.db.repository.UserRepository;


public class FirstLoginPasswordChange extends javax.swing.JFrame {

    /**
     * Creates new form FirstLoginPasswordChange
     */
    public FirstLoginPasswordChange() {
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

        OldPassword = new javax.swing.JPasswordField();
        NewPassword = new javax.swing.JPasswordField();
        RepeatNewPassword = new javax.swing.JPasswordField();
        ChangePasswordLabel = new javax.swing.JLabel();
        OldPasswordLabel = new javax.swing.JLabel();
        NewPasswordLabel = new javax.swing.JLabel();
        RepeatNewPasswordLabel = new javax.swing.JLabel();
        AcceptButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 500));
        setMinimumSize(new java.awt.Dimension(800, 500));
        setPreferredSize(new java.awt.Dimension(700, 450));
        getContentPane().setLayout(null);

        OldPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OldPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(OldPassword);
        OldPassword.setBounds(479, 130, 97, 20);
        getContentPane().add(NewPassword);
        NewPassword.setBounds(479, 177, 97, 20);

        RepeatNewPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Enter(evt);
            }
        });
        getContentPane().add(RepeatNewPassword);
        RepeatNewPassword.setBounds(479, 226, 97, 20);

        ChangePasswordLabel.setForeground(new java.awt.Color(255, 255, 255));
        ChangePasswordLabel.setText("Zmiana hasła po pierwszym logowaniu");
        getContentPane().add(ChangePasswordLabel);
        ChangePasswordLabel.setBounds(239, 66, 222, 14);

        OldPasswordLabel.setForeground(new java.awt.Color(255, 255, 255));
        OldPasswordLabel.setText("Stare hasło:");
        getContentPane().add(OldPasswordLabel);
        OldPasswordLabel.setBounds(479, 110, 97, 14);

        NewPasswordLabel.setForeground(new java.awt.Color(255, 255, 255));
        NewPasswordLabel.setText("Nowe hasło:");
        getContentPane().add(NewPasswordLabel);
        NewPasswordLabel.setBounds(479, 157, 97, 14);

        RepeatNewPasswordLabel.setForeground(new java.awt.Color(255, 255, 255));
        RepeatNewPasswordLabel.setText("Powtóz nowe hasło:");
        getContentPane().add(RepeatNewPasswordLabel);
        RepeatNewPasswordLabel.setBounds(479, 206, 97, 14);

        AcceptButton.setText("Zatwierdź");
        AcceptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcceptButtonActionPerformed(evt);
            }
        });
        getContentPane().add(AcceptButton);
        AcceptButton.setBounds(545, 257, 79, 23);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/backgroundFrame.png"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(836, 449));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 836, 449);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AcceptButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcceptButtonActionPerformed
        if (new String(OldPassword.getPassword()).equals(AuthenticationManager.getUser().getPassword())) {
            if (new String(NewPassword.getPassword()).equals(new String(RepeatNewPassword.getPassword()))) {
                new UserRepository().updatePassword(AuthenticationManager.getUser().getUserID(),new String(NewPassword.getPassword()));
                setVisible(false);
                new ManagerViewFrame().setVisible(true);
            }
        }
    }//GEN-LAST:event_AcceptButtonActionPerformed

    private void OldPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OldPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OldPasswordActionPerformed

    private void Enter(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Enter
        AcceptButtonActionPerformed(evt);
    }//GEN-LAST:event_Enter


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AcceptButton;
    private javax.swing.JLabel ChangePasswordLabel;
    private javax.swing.JPasswordField NewPassword;
    private javax.swing.JLabel NewPasswordLabel;
    private javax.swing.JPasswordField OldPassword;
    private javax.swing.JLabel OldPasswordLabel;
    private javax.swing.JPasswordField RepeatNewPassword;
    private javax.swing.JLabel RepeatNewPasswordLabel;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
