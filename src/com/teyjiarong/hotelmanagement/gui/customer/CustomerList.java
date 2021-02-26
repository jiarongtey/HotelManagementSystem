/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teyjiarong.hotelmanagement.gui.customer;

import com.teyjiarong.hotelmanagement.HotelManagement;
import com.teyjiarong.hotelmanagement.booking.Booking;
import com.teyjiarong.hotelmanagement.booking.BookingHandler;
import com.teyjiarong.hotelmanagement.customer.Customer;
import com.teyjiarong.hotelmanagement.customer.CustomerHandler;
import com.teyjiarong.hotelmanagement.gui.ProfilePage;
import com.teyjiarong.hotelmanagement.gui.booking.BookingManage;
import com.teyjiarong.hotelmanagement.staff.Staff;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;

/**
 *
 * @author user
 */
public class CustomerList extends javax.swing.JFrame {

    private Staff staff;
    private DefaultListModel model = new DefaultListModel();
    private DefaultListModel bookingModel = new DefaultListModel();
    private CustomerHandler handler;
    private BookingHandler bookingHandler;
    private Customer temporaryCustomer = null;
    
    

    public CustomerList(Staff staff) {
        initComponents();
        this.staff = staff;
        this.handler = HotelManagement.customerHandler;
        this.setExtendedState(this.getExtendedState()|JFrame.MAXIMIZED_BOTH );
        this.customerList.setModel(model);
        this.bookingList.setModel(bookingModel);
        this.bookingHandler = HotelManagement.bookingHandler;
        
        this.fullname.setText("");
        this.email.setText("");
        this.contactnumber.setText("");
        this.icpassport.setText("");
        updateTable("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        customerList = new javax.swing.JList<>();
        searchTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        searchbtn = new javax.swing.JButton();
        usernametxt2 = new javax.swing.JLabel();
        usernametxt3 = new javax.swing.JLabel();
        usernametxt4 = new javax.swing.JLabel();
        usernametxt5 = new javax.swing.JLabel();
        usernametxt6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        bookingList = new javax.swing.JList<>();
        fullname = new javax.swing.JLabel();
        contactnumber = new javax.swing.JLabel();
        icpassport = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        checkBtn = new javax.swing.JButton();
        newBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        remove = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(168, 230, 207));

        jPanel2.setBackground(new java.awt.Color(253, 255, 171));

        jLabel2.setFont(new java.awt.Font("Mistral", 1, 48)); // NOI18N
        jLabel2.setText("APU Hotel Management - Customer");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(41, 41, 41))
        );

        customerList.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        customerList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        customerList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customerListMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(customerList);

        searchTxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SEARCH BY IC/Passport:");

        searchbtn.setBackground(new java.awt.Color(255, 211, 182));
        searchbtn.setFont(new java.awt.Font("Mistral", 1, 24)); // NOI18N
        searchbtn.setText("GO");
        searchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbtnActionPerformed(evt);
            }
        });

        usernametxt2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        usernametxt2.setForeground(new java.awt.Color(255, 255, 255));
        usernametxt2.setText("Full Name:");

        usernametxt3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        usernametxt3.setForeground(new java.awt.Color(255, 255, 255));
        usernametxt3.setText("Contact Number:");

        usernametxt4.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        usernametxt4.setForeground(new java.awt.Color(255, 255, 255));
        usernametxt4.setText("Email:");

        usernametxt5.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        usernametxt5.setForeground(new java.awt.Color(255, 255, 255));
        usernametxt5.setText("IC/Passport:");

        usernametxt6.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        usernametxt6.setForeground(new java.awt.Color(255, 255, 255));
        usernametxt6.setText("Bookings:");

        bookingList.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jScrollPane1.setViewportView(bookingList);

        fullname.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        fullname.setForeground(new java.awt.Color(255, 255, 255));
        fullname.setText("[variable]");

        contactnumber.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        contactnumber.setForeground(new java.awt.Color(255, 255, 255));
        contactnumber.setText("[variable]");

        icpassport.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        icpassport.setForeground(new java.awt.Color(255, 255, 255));
        icpassport.setText("[show]");
        icpassport.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icpassport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icpassportMouseClicked(evt);
            }
        });

        email.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        email.setForeground(new java.awt.Color(255, 255, 255));
        email.setText("[variable]");

        checkBtn.setBackground(new java.awt.Color(255, 211, 182));
        checkBtn.setFont(new java.awt.Font("Mistral", 1, 24)); // NOI18N
        checkBtn.setText("Check");
        checkBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBtnActionPerformed(evt);
            }
        });

        newBtn.setBackground(new java.awt.Color(255, 211, 182));
        newBtn.setFont(new java.awt.Font("Mistral", 1, 24)); // NOI18N
        newBtn.setText("NEW");
        newBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newBtnActionPerformed(evt);
            }
        });

        updateBtn.setBackground(new java.awt.Color(255, 211, 182));
        updateBtn.setFont(new java.awt.Font("Mistral", 1, 24)); // NOI18N
        updateBtn.setText("UPDATE");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        backBtn.setBackground(new java.awt.Color(255, 211, 182));
        backBtn.setFont(new java.awt.Font("Mistral", 1, 24)); // NOI18N
        backBtn.setText("BACK");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        remove.setBackground(new java.awt.Color(255, 211, 182));
        remove.setFont(new java.awt.Font("Mistral", 1, 24)); // NOI18N
        remove.setText("REMOVE");
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(searchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 711, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(searchbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 841, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addGap(214, 214, 214)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usernametxt2)
                            .addComponent(usernametxt3)
                            .addComponent(usernametxt5)
                            .addComponent(usernametxt4)
                            .addComponent(usernametxt6))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(icpassport)
                            .addComponent(contactnumber)
                            .addComponent(fullname)
                            .addComponent(email)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(remove)
                            .addGap(18, 18, 18)
                            .addComponent(newBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 635, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(checkBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(164, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(remove, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(usernametxt2)
                            .addComponent(fullname))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(usernametxt3)
                            .addComponent(contactnumber))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(usernametxt5)
                            .addComponent(icpassport))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(usernametxt4)
                            .addComponent(email))
                        .addGap(18, 18, 18)
                        .addComponent(usernametxt6)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(checkBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)))
                .addGap(0, 165, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbtnActionPerformed
        String search = this.searchTxt.getText();
        updateTable(search);
    }//GEN-LAST:event_searchbtnActionPerformed

    private void checkBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBtnActionPerformed
        String s = this.bookingList.getSelectedValue().split(" - ")[0].replace("BookingID:", "");
        new BookingManage(this.staff,s).setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_checkBtnActionPerformed

    private void newBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newBtnActionPerformed
        new CustomerManage(this).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_newBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        if(this.temporaryCustomer!=null){
            new CustomerManage(this,this.temporaryCustomer).setVisible(true);
            this.setVisible(false);
        }else{
            HotelManagement.errorMesg("Please select a customer to perform.", "View Button");
        }
    }//GEN-LAST:event_updateBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        new ProfilePage(staff).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    private void customerListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerListMouseClicked
        if(this.customerList.getSelectedIndex() >= 0){
            
            Customer c = handler.getCustomerByName(this.customerList.getSelectedValue());
            this.fullname.setText(c.getName());
            this.contactnumber.setText(c.getContactNumber());
            this.email.setText(c.getEmail());
            this.temporaryCustomer= c;
            this.icpassport.setText("[show]");
            this.bookingModel.clear();
            
            List<Booking> l = bookingHandler.getCustomerBookings(c);
            
            if(l.size() > 0){
                for(int i = 0;i < l.size();i++){
                    Booking b = l.get(i);
                    bookingModel.addElement("BookingID:"+b.getBookingID() + " - Room:" + b.getRoom().getRoomNumber() + "F" + b.getRoom().getFloor());
                }
            }
        }
    }//GEN-LAST:event_customerListMouseClicked

    private void icpassportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icpassportMouseClicked
        if(this.icpassport.getText().equals("[show]")){
            this.icpassport.setText(this.temporaryCustomer.getICPassport());
        }else{
            this.icpassport.setText("[show]");
        }
    }//GEN-LAST:event_icpassportMouseClicked

    private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
        if(this.temporaryCustomer!=null){
            HotelManagement.customerHandler.removeCustomer(this.temporaryCustomer.getICPassport());
            this.updateTable("");
            
        }else{
            HotelManagement.errorMesg("This select a customer to perform.", "Update Button");
        }
    }//GEN-LAST:event_removeActionPerformed
    public void updateTable(String search){
        
        //Clear everything
        model.clear();
        this.fullname.setText("");
        this.email.setText("");
        this.contactnumber.setText("");
        this.icpassport.setText("");
        
        if(search.equals("")){
            handler.getCustomers().entrySet().forEach(m -> {
                model.addElement(((Customer)m.getValue()).getName());
            });
        }else{
            Customer customer = handler.getCustomer(search);
            if(customer != null){
                model.addElement(customer.getName());
            }
        }
        
        if(model.getSize() == 0){
            model.addElement("No data..");
            this.customerList.setEnabled(false);
        }else{
            this.customerList.setEnabled(true);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JList<String> bookingList;
    private javax.swing.JButton checkBtn;
    private javax.swing.JLabel contactnumber;
    private javax.swing.JList<String> customerList;
    private javax.swing.JLabel email;
    private javax.swing.JLabel fullname;
    private javax.swing.JLabel icpassport;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton newBtn;
    private javax.swing.JButton remove;
    private javax.swing.JTextField searchTxt;
    private javax.swing.JButton searchbtn;
    private javax.swing.JButton updateBtn;
    private javax.swing.JLabel usernametxt2;
    private javax.swing.JLabel usernametxt3;
    private javax.swing.JLabel usernametxt4;
    private javax.swing.JLabel usernametxt5;
    private javax.swing.JLabel usernametxt6;
    // End of variables declaration//GEN-END:variables
}
