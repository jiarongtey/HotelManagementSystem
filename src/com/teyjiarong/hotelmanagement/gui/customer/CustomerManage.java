package com.teyjiarong.hotelmanagement.gui.customer;

import com.teyjiarong.hotelmanagement.HotelManagement;
import com.teyjiarong.hotelmanagement.customer.Customer;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;


public class CustomerManage extends javax.swing.JFrame {

    private CustomerList customerList;
    private Customer c;
    
    private void errorRefresh(){
        this.errorContact.setText("");
        this.errorEmail.setText("");
        this.errorIC.setText("");
        this.errorName.setText("");
    }
    
    public CustomerManage(CustomerList customerList) {
        initComponents();
        this.customerList = customerList;
        
        errorRefresh();
        
    }
    
    public CustomerManage(CustomerList customerList, Customer customer) {
        initComponents();
        this.customerList = customerList;
        this.icfield.setEnabled(false);
        this.icfield.setText(customer.getICPassport());
        this.namefield.setEnabled(false);
        this.namefield.setText(customer.getName());
        this.emailfield.setText(customer.getEmail());
        this.contactfield.setText(customer.getContactNumber());
        this.c = customer;
        errorRefresh();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cancelBtn = new javax.swing.JButton();
        usernametxt2 = new javax.swing.JLabel();
        usernametxt3 = new javax.swing.JLabel();
        usernametxt4 = new javax.swing.JLabel();
        icfield = new javax.swing.JTextField();
        namefield = new javax.swing.JTextField();
        emailfield = new javax.swing.JTextField();
        usernametxt5 = new javax.swing.JLabel();
        contactfield = new javax.swing.JTextField();
        saveBtn = new javax.swing.JButton();
        errorIC = new javax.swing.JLabel();
        errorName = new javax.swing.JLabel();
        errorEmail = new javax.swing.JLabel();
        errorContact = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(168, 230, 207));

        jLabel2.setFont(new java.awt.Font("Mistral", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(253, 255, 171));
        jLabel2.setText("Customer");

        cancelBtn.setBackground(new java.awt.Color(255, 211, 182));
        cancelBtn.setFont(new java.awt.Font("Mistral", 1, 24)); // NOI18N
        cancelBtn.setText("CANCEL");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        usernametxt2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        usernametxt2.setForeground(new java.awt.Color(255, 255, 255));
        usernametxt2.setText("IC/Passport:");

        usernametxt3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        usernametxt3.setForeground(new java.awt.Color(255, 255, 255));
        usernametxt3.setText("Name:");

        usernametxt4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        usernametxt4.setForeground(new java.awt.Color(255, 255, 255));
        usernametxt4.setText("Email:");

        icfield.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        namefield.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        emailfield.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        usernametxt5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        usernametxt5.setForeground(new java.awt.Color(255, 255, 255));
        usernametxt5.setText("Contact Number:");

        contactfield.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        saveBtn.setBackground(new java.awt.Color(255, 211, 182));
        saveBtn.setFont(new java.awt.Font("Mistral", 1, 24)); // NOI18N
        saveBtn.setText("SAVE");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        errorIC.setForeground(new java.awt.Color(255, 0, 0));
        errorIC.setText("error");

        errorName.setForeground(new java.awt.Color(255, 0, 0));
        errorName.setText("error");

        errorEmail.setForeground(new java.awt.Color(255, 0, 0));
        errorEmail.setText("error");

        errorContact.setForeground(new java.awt.Color(255, 0, 0));
        errorContact.setText("error");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(usernametxt2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(errorIC)
                                    .addComponent(icfield, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(usernametxt3)
                                    .addComponent(usernametxt4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(errorName)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(namefield, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(emailfield, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(errorEmail)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(usernametxt5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(errorContact)
                                    .addComponent(contactfield, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(74, 74, 74))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 25, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel2)
                .addGap(73, 73, 73)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernametxt2)
                    .addComponent(icfield, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorIC)
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namefield, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernametxt3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorName)
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernametxt4)
                    .addComponent(emailfield, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(errorEmail)
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernametxt5)
                    .addComponent(contactfield, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorContact)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        this.dispose();
        this.customerList.setVisible(true);
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        boolean error = false;
        errorRefresh();
        
        if(this.icfield.getText().equals("")){
            this.errorIC.setText("This field cannot be empty");
            error = true;
        }
        
        if(this.icfield.isEnabled()){
            if(HotelManagement.customerHandler.getCustomers().containsKey(this.icfield.getText())){
                this.errorIC.setText("This IC / Passport is been used.");
                error =true;
            }
        }
        
        
        if(this.namefield.getText().equals("")){
            this.errorName.setText("This field cannot be empty");
            error = true;
        }
        if(this.emailfield.getText().equals("")){
            this.errorEmail.setText("This field cannot be empty");
            error = true;
        }
        if(!this.emailfield.getText().contains("@")){
            this.errorEmail.setText("Please enter a valid email.");
            error= true;
        }
        
        if(this.contactfield.getText().equals("")){
            this.errorContact.setText("This field cannot be empty");
            error = true;
        }
        
        
        if(error){
            HotelManagement.runnable.run();
            return;
        }
        
        
        //Update
        if(this.c != null){
            Customer c = this.c;
            
            int n = JOptionPane.showConfirmDialog(null, "Would you want to change the customer information?", "Customer Manage", JOptionPane.YES_NO_OPTION);
            if (n == JOptionPane.YES_OPTION) {
                c.setContactNumber(this.contactfield.getText());
                c.setEmail(this.emailfield.getText());
                JOptionPane.showMessageDialog(null, "Successfully update the information.", "Customer Manage", JOptionPane.INFORMATION_MESSAGE);
            }else{
                return;
            }  
            
        }else{
        //New Customer
            Customer newCustomer = new Customer(this.namefield.getText(),this.icfield.getText(),this.contactfield.getText(),this.emailfield.getText());
            HotelManagement.customerHandler.addCustomer(newCustomer);
        }
        
        this.dispose();
        this.customerList.updateTable("");
        this.customerList.setVisible(true);
        
    }//GEN-LAST:event_saveBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelBtn;
    private javax.swing.JTextField contactfield;
    private javax.swing.JTextField emailfield;
    private javax.swing.JLabel errorContact;
    private javax.swing.JLabel errorEmail;
    private javax.swing.JLabel errorIC;
    private javax.swing.JLabel errorName;
    private javax.swing.JTextField icfield;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField namefield;
    private javax.swing.JButton saveBtn;
    private javax.swing.JLabel usernametxt2;
    private javax.swing.JLabel usernametxt3;
    private javax.swing.JLabel usernametxt4;
    private javax.swing.JLabel usernametxt5;
    // End of variables declaration//GEN-END:variables
}
