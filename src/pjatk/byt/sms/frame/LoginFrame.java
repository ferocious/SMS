
package pjatk.byt.sms.frame;

import pjatk.byt.sms.authentication.AuthenticationManager;
import pjatk.byt.sms.db.repository.UserRepository;
import pjatk.byt.sms.db.repository.User;


public class LoginFrame extends javax.swing.JFrame {


    public LoginFrame() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usernameInput = new javax.swing.JTextField();
        usernameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        passwordInput = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        errorLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 500));
        setPreferredSize(new java.awt.Dimension(700, 450));
        setResizable(false);
        getContentPane().setLayout(null);

        usernameInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameInputActionPerformed(evt);
            }
        });
        getContentPane().add(usernameInput);
        usernameInput.setBounds(310, 260, 100, 20);

        usernameLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        usernameLabel.setForeground(new java.awt.Color(255, 255, 255));
        usernameLabel.setText("Użytkownik:");
        getContentPane().add(usernameLabel);
        usernameLabel.setBounds(310, 240, 100, 14);

        passwordLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(255, 255, 255));
        passwordLabel.setText("Hasło:");
        getContentPane().add(passwordLabel);
        passwordLabel.setBounds(310, 290, 90, 14);

        loginButton.setText("Zaloguj");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        getContentPane().add(loginButton);
        loginButton.setBounds(330, 350, 80, 23);

        passwordInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordInputActionPerformed(evt);
            }
        });
        getContentPane().add(passwordInput);
        passwordInput.setBounds(310, 310, 100, 20);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/logoSMS.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(160, 10, 250, 180);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/backgroundFrame.png"))); // NOI18N
        jLabel1.setAlignmentY(0.0F);
        jLabel1.setMaximumSize(new java.awt.Dimension(800, 500));
        jLabel1.setMinimumSize(new java.awt.Dimension(800, 500));
        jLabel1.setPreferredSize(new java.awt.Dimension(800, 500));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-110, 0, 836, 449);

        errorLabel.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(errorLabel);
        errorLabel.setBounds(270, 210, 133, 14);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameInputActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        String username = usernameInput.getText();
        String password = new String(passwordInput.getPassword());
        
        UserRepository userDao = new UserRepository();
        User user = userDao.findByUserAndPassword(username, password);
        
        if (user == null) {
            System.out.println("Użytkownik nieznany. Skontaktuj się z administratorem.");
            errorLabel.setText("Błędny login lub hasło.");
        } else if (user.getLoginFLag() == true) {
            System.out.println("Zalogowany jako administrator.");
            setVisible(false);
            AuthenticationManager.setUser(user);
            new ManagerViewFrame().setVisible(true);
        } else if (user.getLoginFLag() == false) {
            System.out.println("To jest twoje pierwsze logowanie, zmień hasło.");
            setVisible(false);
            AuthenticationManager.setUser(user);
            new FirstLoginPasswordChange().setVisible(true);
        }
            
    }//GEN-LAST:event_loginButtonActionPerformed
/*logowanie przez enter*/
    private void passwordInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordInputActionPerformed
        loginButtonActionPerformed(evt);
    }//GEN-LAST:event_passwordInputActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel errorLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton loginButton;
    private javax.swing.JPasswordField passwordInput;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JTextField usernameInput;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
}
