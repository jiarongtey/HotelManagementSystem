/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teyjiarong.hotelmanagement.gui.booking;

import com.teyjiarong.hotelmanagement.HotelManagement;
import com.teyjiarong.hotelmanagement.booking.Booking;
import com.teyjiarong.hotelmanagement.booking.BookingHandler;
import com.teyjiarong.hotelmanagement.gui.ProfilePage;
import com.teyjiarong.hotelmanagement.staff.Staff;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public final class BookingList extends javax.swing.JFrame {

    private Staff staff;
    public BookingList(Staff staff) {
        initComponents();
        //Design table
        this.bookingTable.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 18));
        this.bookingTable.getTableHeader().setOpaque(false);
        this.bookingTable.getTableHeader().setBackground(new Color(32,136,203));
        this.bookingTable.getTableHeader().setForeground(new Color(255,255,255));
        this.bookingTable.setRowHeight(25);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        bookingTable.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        bookingTable.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
        bookingTable.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
        bookingTable.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);
        bookingTable.getColumnModel().getColumn(4).setCellRenderer(centerRenderer);
        
        this.staff = staff;
        this.setExtendedState(this.getExtendedState()|JFrame.MAXIMIZED_BOTH );
        refreshTable("");
        
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        bookingTable = new javax.swing.JTable();
        backBtn = new javax.swing.JButton();
        newBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        searchField = new javax.swing.JTextField();
        bookingid = new javax.swing.JLabel();
        refreshBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(168, 230, 207));

        jPanel2.setBackground(new java.awt.Color(253, 255, 171));

        jLabel2.setFont(new java.awt.Font("Mistral", 1, 48)); // NOI18N
        jLabel2.setText("APU Hotel Management - Booking");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel2)
                .addContainerGap(1315, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(41, 41, 41))
        );

        bookingTable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bookingTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Booking ID", "Customer", "Start Date", "End Date", "Days"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        bookingTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        bookingTable.setRowHeight(25);
        bookingTable.setSelectionBackground(new java.awt.Color(232, 57, 95));
        bookingTable.setShowVerticalLines(false);
        bookingTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(bookingTable);

        backBtn.setBackground(new java.awt.Color(255, 211, 182));
        backBtn.setFont(new java.awt.Font("Mistral", 1, 24)); // NOI18N
        backBtn.setText("BACK");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
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
        updateBtn.setText("VIEW");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        searchField.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFieldActionPerformed(evt);
            }
        });
        searchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchFieldKeyPressed(evt);
            }
        });

        bookingid.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bookingid.setText("Search:");

        refreshBtn.setBackground(new java.awt.Color(255, 211, 182));
        refreshBtn.setFont(new java.awt.Font("Mistral", 1, 24)); // NOI18N
        refreshBtn.setText("REFRESH");
        refreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bookingid)
                        .addGap(22, 22, 22)
                        .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 942, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(refreshBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(newBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1755, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(38, 38, 38)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(newBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bookingid, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(refreshBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 95, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        this.dispose();
        new ProfilePage(staff).setVisible(true);
    }//GEN-LAST:event_backBtnActionPerformed

    private void newBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newBtnActionPerformed
       this.dispose();
       new BookingManage(this.staff,"").setVisible(true);
    }//GEN-LAST:event_newBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        if(this.bookingTable.getSelectedRow() < 0){
            HotelManagement.errorMesg("Please select a booking to perform this action.", "Select a row");
            return;
        }
        new BookingManage(this.staff, (String) this.bookingTable.getValueAt(this.bookingTable.getSelectedRow(), 0)).setVisible(true);
         this.dispose();

    }//GEN-LAST:event_updateBtnActionPerformed

    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchFieldActionPerformed

    private void searchFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFieldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){ // when enter is pressed = btnLogin
            refreshTable(searchField.getText());
        }
    }//GEN-LAST:event_searchFieldKeyPressed

    private void refreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtnActionPerformed
        this.searchField.setText("");
        refreshTable("");
    }//GEN-LAST:event_refreshBtnActionPerformed

    public void refreshTable(String search){
        BookingHandler bhandler = HotelManagement.bookingHandler;
        DefaultTableModel Df = (DefaultTableModel)bookingTable.getModel();
        Df.setRowCount(0);
        if(search.equals("")){
            bhandler.getBookings().entrySet().stream().map(m -> (Booking)m.getValue()).forEachOrdered(booking -> {
                Df.addRow(new Object[]{booking.getBookingID(), booking.getCustomer().getName(),booking.getStartDate(), booking.getEndDate(),booking.getTotalDays()});
            });
        }else{
            bhandler.getBookings().entrySet().stream().map(m -> (Booking)m.getValue()).forEachOrdered(booking -> {
              
                   if(booking.getCustomer().getName().contains(search) || booking.getBookingID().contains(search)){
                    Df.addRow(new Object[]{booking.getBookingID(), booking.getCustomer().getName(),booking.getStartDate(), booking.getEndDate(),booking.getTotalDays()});
                
               
               }
               
            });
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JTable bookingTable;
    private javax.swing.JLabel bookingid;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton newBtn;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JTextField searchField;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
