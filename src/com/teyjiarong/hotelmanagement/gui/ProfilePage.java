package com.teyjiarong.hotelmanagement.gui;

import com.teyjiarong.hotelmanagement.gui.booking.BookingList;
import com.teyjiarong.hotelmanagement.staff.Staff;
import com.teyjiarong.hotelmanagement.gui.customer.CustomerList;


public class ProfilePage extends javax.swing.JFrame {

    private Staff staff;
    
    public ProfilePage(Staff staff) {
        initComponents();
        this.staff = staff;
        this.fullnametxt.setText(staff.getFullName());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        fullnametxt = new javax.swing.JLabel();
        customerListBtn = new javax.swing.JButton();
        logout = new javax.swing.JLabel();
        bookingListBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(168, 230, 207));

        jLabel2.setFont(new java.awt.Font("Mistral", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(253, 255, 171));
        jLabel2.setText("Profile");

        fullnametxt.setFont(new java.awt.Font("Mistral", 0, 48)); // NOI18N
        fullnametxt.setForeground(new java.awt.Color(255, 255, 255));
        fullnametxt.setText("[full_name]");

        customerListBtn.setBackground(new java.awt.Color(255, 211, 182));
        customerListBtn.setFont(new java.awt.Font("Mistral", 1, 24)); // NOI18N
        customerListBtn.setText("Customer List");
        customerListBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerListBtnActionPerformed(evt);
            }
        });

        logout.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        logout.setForeground(new java.awt.Color(255, 255, 255));
        logout.setText("[logout]");
        logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });

        bookingListBtn.setBackground(new java.awt.Color(255, 211, 182));
        bookingListBtn.setFont(new java.awt.Font("Mistral", 1, 24)); // NOI18N
        bookingListBtn.setText("Booking List");
        bookingListBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookingListBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(fullnametxt)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logout)
                        .addGap(26, 26, 26))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(customerListBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bookingListBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 25, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(logout)))
                .addGap(18, 18, 18)
                .addComponent(fullnametxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 312, Short.MAX_VALUE)
                .addComponent(customerListBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bookingListBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
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

    private void customerListBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerListBtnActionPerformed
        new CustomerList(staff).setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_customerListBtnActionPerformed

    private void bookingListBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookingListBtnActionPerformed
        new BookingList(staff).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bookingListBtnActionPerformed

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        this.dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_logoutMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bookingListBtn;
    private javax.swing.JButton customerListBtn;
    private javax.swing.JLabel fullnametxt;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logout;
    // End of variables declaration//GEN-END:variables
}
