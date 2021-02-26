package com.teyjiarong.hotelmanagement.gui;

import com.teyjiarong.hotelmanagement.HotelManagement;
import com.teyjiarong.hotelmanagement.staff.Staff;
import com.teyjiarong.hotelmanagement.staff.StaffHandler;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;


public class Login extends javax.swing.JFrame {

    private final Runnable runnable;
    
    public Login() {
        initComponents();
        runnable = (Runnable) Toolkit.getDefaultToolkit().getDesktopProperty("win.sound.exclamation");
        this.errorLabel.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        usernameTxt = new javax.swing.JTextField();
        passwordTxt = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lognBtn = new javax.swing.JButton();
        errorLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(168, 230, 207));

        jLabel1.setFont(new java.awt.Font("Mistral", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(253, 255, 171));
        jLabel1.setText("APU");

        jLabel2.setFont(new java.awt.Font("Mistral", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(253, 255, 171));
        jLabel2.setText("Hotel Management");

        usernameTxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        usernameTxt.setBorder(null);

        passwordTxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        passwordTxt.setBorder(null);
        passwordTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordTxtKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Mistral", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Username:");

        jLabel4.setFont(new java.awt.Font("Mistral", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password:");

        lognBtn.setBackground(new java.awt.Color(255, 211, 182));
        lognBtn.setFont(new java.awt.Font("Mistral", 1, 24)); // NOI18N
        lognBtn.setText("Login");
        lognBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lognBtnActionPerformed(evt);
            }
        });
        lognBtn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lognBtnKeyPressed(evt);
            }
        });

        errorLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        errorLabel.setForeground(new java.awt.Color(255, 51, 102));
        errorLabel.setText("error mesg");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lognBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(usernameTxt)
                                .addComponent(passwordTxt))
                            .addComponent(errorLabel)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(108, 108, 108)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(114, 114, 114)
                                .addComponent(jLabel4)))
                        .addGap(112, 112, 112))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(227, 227, 227))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(26, 26, 26)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(errorLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                .addComponent(lognBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void errorMesg(String mesg){
        
        runnable.run();
        this.errorLabel.setText(mesg);
        
    }
    
    private void lognBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lognBtnActionPerformed
        String username = usernameTxt.getText();
        StaffHandler handler = HotelManagement.staffHandler;
        if(!handler.getStaffs().containsKey(username)){
            this.errorMesg("Invalid username or password");
            return;
        }
        Staff staff = handler.getStaff(username);
        String password = String.valueOf(passwordTxt.getPassword());
        if(!staff.getPassword().equals(password)){
            this.errorMesg("Invalid username or password");
            return;
        }
        new ProfilePage(staff).setVisible(true);
        this.dispose();
        
        
        
    }//GEN-LAST:event_lognBtnActionPerformed

    private void passwordTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordTxtKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){ // when enter is pressed = btnLogin
            lognBtn.doClick();
        }
    }//GEN-LAST:event_passwordTxtKeyPressed

    private void lognBtnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lognBtnKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){ // when enter is pressed = btnLogin
            lognBtn.doClick();
        }    }//GEN-LAST:event_lognBtnKeyPressed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel errorLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton lognBtn;
    private javax.swing.JPasswordField passwordTxt;
    private javax.swing.JTextField usernameTxt;
    // End of variables declaration//GEN-END:variables
}
