/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teyjiarong.hotelmanagement.gui.booking;

import com.teyjiarong.hotelmanagement.HotelManagement;
import com.teyjiarong.hotelmanagement.booking.Booking;
import com.teyjiarong.hotelmanagement.booking.BookingHandler;
import com.teyjiarong.hotelmanagement.customer.Customer;
import com.teyjiarong.hotelmanagement.room.Room;
import com.teyjiarong.hotelmanagement.room.RoomHandler;
import com.teyjiarong.hotelmanagement.staff.Staff;
import java.awt.event.KeyEvent;
import java.time.LocalDate;

import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author user
 */
public class BookingManage extends javax.swing.JFrame {

    private Staff staff;
    private Booking booking;
    private BookingHandler handler;
    private Customer customer;
    
    
    public BookingManage(Staff staff, String bookingID) {
        initComponents();
        
        this.handler = HotelManagement.bookingHandler;
        this.staff = staff;
        this.setExtendedState(this.getExtendedState()|JFrame.MAXIMIZED_BOTH );
        
        
        this.booking = handler.getBooking(bookingID);
        
        
        //Old Booking
        if(booking != null){
            
            this.icpassport.setEnabled(false);
            refreshCustomerDetail(booking.getCustomer());
            
            this.bookingid.setText(bookingID);
            Date sDate = Date.from(booking.getStartDate().atStartOfDay(ZoneId.systemDefault()).toInstant());
            Date eDate = Date.from(booking.getEndDate().atStartOfDay(ZoneId.systemDefault()).toInstant());

            this.startDate.setDate(sDate);
            this.endDate.setDate(eDate);
            this.totalAmount.setText(String.valueOf(booking.getTotalAmount()));
            this.paidAmount.setText(String.valueOf(booking.getTotalPaid()));
            this.balance.setText(String.valueOf(booking.getBalance()));
            this.roomSelected.setText(String.valueOf(booking.getRoom().getRoomNumber()));
            this.floorSelected.setText(String.valueOf(booking.getRoom().getFloor()));
            this.customer = booking.getCustomer();
            
            this.paidAmount.setEnabled(true);
            this.saveBtn.setEnabled(false);
            this.print.setEnabled(true);
            
        }else{
        //New Booking
            this.bookingid.setText(String.valueOf(handler.generateNewBooking()));
            this.goBtn.setEnabled(true);
            this.searhbtn.setEnabled(true);
            this.balance.setEnabled(true);
            this.paidAmount.setEnabled(true);
            this.print.setEnabled(false);


            this.name.setText("");
            this.email.setText("");
            this.contact.setText("");
            this.icpassport.setText("");
            this.totalAmount.setText("");
            this.paidAmount.setText("");
            this.balance.setText("");
            this.roomSelected.setText("");
            this.floorSelected.setText("");
            this.customer = null;
            this.removeBtn.setEnabled(false);
        }
        
    }
    
    private void refreshCustomerDetail(Customer customer){
        this.name.setText(customer.getName());
        this.email.setText(customer.getEmail());
        this.contact.setText(customer.getContactNumber());
        this.icpassport.setText(customer.getICPassport());
        
        
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usernameTxt = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        f1r1 = new javax.swing.JButton();
        f1r2 = new javax.swing.JButton();
        f1r3 = new javax.swing.JButton();
        f1r4 = new javax.swing.JButton();
        f1r9 = new javax.swing.JButton();
        f1r8 = new javax.swing.JButton();
        f1r7 = new javax.swing.JButton();
        f1r6 = new javax.swing.JButton();
        f1r5 = new javax.swing.JButton();
        f1r10 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        f2r5 = new javax.swing.JButton();
        f2r10 = new javax.swing.JButton();
        f2r4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        f2r9 = new javax.swing.JButton();
        f2r8 = new javax.swing.JButton();
        f2r7 = new javax.swing.JButton();
        f2r6 = new javax.swing.JButton();
        f2r1 = new javax.swing.JButton();
        f2r2 = new javax.swing.JButton();
        f2r3 = new javax.swing.JButton();
        removeBtn = new javax.swing.JButton();
        saveBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        icpassport = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        goBtn = new javax.swing.JButton();
        email = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        contact = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        startDate = new com.toedter.calendar.JDateChooser();
        endDate = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        bookingid = new javax.swing.JLabel();
        searhbtn = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        totalAmount = new javax.swing.JLabel();
        balance = new javax.swing.JLabel();
        paidAmount = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        roomSelected = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        floorSelected = new javax.swing.JLabel();
        print = new javax.swing.JButton();

        usernameTxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        usernameTxt.setBorder(null);

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(41, 41, 41))
        );

        f1r1.setBackground(new java.awt.Color(255, 211, 182));
        f1r1.setFont(new java.awt.Font("Mistral", 1, 24)); // NOI18N
        f1r1.setText("Room 1");
        f1r1.setEnabled(false);
        f1r1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f1r1ActionPerformed(evt);
            }
        });

        f1r2.setBackground(new java.awt.Color(255, 211, 182));
        f1r2.setFont(new java.awt.Font("Mistral", 1, 24)); // NOI18N
        f1r2.setText("Room 2");
        f1r2.setEnabled(false);
        f1r2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f1r2ActionPerformed(evt);
            }
        });

        f1r3.setBackground(new java.awt.Color(255, 211, 182));
        f1r3.setFont(new java.awt.Font("Mistral", 1, 24)); // NOI18N
        f1r3.setText("Room 3");
        f1r3.setEnabled(false);
        f1r3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f1r3ActionPerformed(evt);
            }
        });

        f1r4.setBackground(new java.awt.Color(255, 211, 182));
        f1r4.setFont(new java.awt.Font("Mistral", 1, 24)); // NOI18N
        f1r4.setText("Room 1");
        f1r4.setEnabled(false);
        f1r4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f1r4ActionPerformed(evt);
            }
        });

        f1r9.setBackground(new java.awt.Color(255, 211, 182));
        f1r9.setFont(new java.awt.Font("Mistral", 1, 24)); // NOI18N
        f1r9.setText("Room 9");
        f1r9.setEnabled(false);
        f1r9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f1r9ActionPerformed(evt);
            }
        });

        f1r8.setBackground(new java.awt.Color(255, 211, 182));
        f1r8.setFont(new java.awt.Font("Mistral", 1, 24)); // NOI18N
        f1r8.setText("Room 8");
        f1r8.setEnabled(false);
        f1r8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f1r8ActionPerformed(evt);
            }
        });

        f1r7.setBackground(new java.awt.Color(255, 211, 182));
        f1r7.setFont(new java.awt.Font("Mistral", 1, 24)); // NOI18N
        f1r7.setText("Room 7");
        f1r7.setEnabled(false);
        f1r7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f1r7ActionPerformed(evt);
            }
        });

        f1r6.setBackground(new java.awt.Color(255, 211, 182));
        f1r6.setFont(new java.awt.Font("Mistral", 1, 24)); // NOI18N
        f1r6.setText("Room 6");
        f1r6.setEnabled(false);
        f1r6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f1r6ActionPerformed(evt);
            }
        });

        f1r5.setBackground(new java.awt.Color(255, 211, 182));
        f1r5.setFont(new java.awt.Font("Mistral", 1, 24)); // NOI18N
        f1r5.setText("Room 5");
        f1r5.setEnabled(false);
        f1r5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f1r5ActionPerformed(evt);
            }
        });

        f1r10.setBackground(new java.awt.Color(255, 211, 182));
        f1r10.setFont(new java.awt.Font("Mistral", 1, 24)); // NOI18N
        f1r10.setText("Room 10");
        f1r10.setEnabled(false);
        f1r10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f1r10ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Mistral", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(253, 255, 171));
        jLabel1.setText("Floor 1");

        f2r5.setBackground(new java.awt.Color(255, 211, 182));
        f2r5.setFont(new java.awt.Font("Mistral", 1, 24)); // NOI18N
        f2r5.setText("Room 5");
        f2r5.setEnabled(false);
        f2r5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f2r5ActionPerformed(evt);
            }
        });

        f2r10.setBackground(new java.awt.Color(255, 211, 182));
        f2r10.setFont(new java.awt.Font("Mistral", 1, 24)); // NOI18N
        f2r10.setText("Room 10");
        f2r10.setEnabled(false);
        f2r10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f2r10ActionPerformed(evt);
            }
        });

        f2r4.setBackground(new java.awt.Color(255, 211, 182));
        f2r4.setFont(new java.awt.Font("Mistral", 1, 24)); // NOI18N
        f2r4.setText("Room 4");
        f2r4.setEnabled(false);
        f2r4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f2r4ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Mistral", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(253, 255, 171));
        jLabel3.setText("Floor 2");

        f2r9.setBackground(new java.awt.Color(255, 211, 182));
        f2r9.setFont(new java.awt.Font("Mistral", 1, 24)); // NOI18N
        f2r9.setText("Room 9");
        f2r9.setEnabled(false);
        f2r9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f2r9ActionPerformed(evt);
            }
        });

        f2r8.setBackground(new java.awt.Color(255, 211, 182));
        f2r8.setFont(new java.awt.Font("Mistral", 1, 24)); // NOI18N
        f2r8.setText("Room 8");
        f2r8.setEnabled(false);
        f2r8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f2r8ActionPerformed(evt);
            }
        });

        f2r7.setBackground(new java.awt.Color(255, 211, 182));
        f2r7.setFont(new java.awt.Font("Mistral", 1, 24)); // NOI18N
        f2r7.setText("Room 7");
        f2r7.setEnabled(false);
        f2r7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f2r7ActionPerformed(evt);
            }
        });

        f2r6.setBackground(new java.awt.Color(255, 211, 182));
        f2r6.setFont(new java.awt.Font("Mistral", 1, 24)); // NOI18N
        f2r6.setText("Room 6");
        f2r6.setEnabled(false);
        f2r6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f2r6ActionPerformed(evt);
            }
        });

        f2r1.setBackground(new java.awt.Color(255, 211, 182));
        f2r1.setFont(new java.awt.Font("Mistral", 1, 24)); // NOI18N
        f2r1.setText("Room 1");
        f2r1.setEnabled(false);
        f2r1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f2r1ActionPerformed(evt);
            }
        });

        f2r2.setBackground(new java.awt.Color(255, 211, 182));
        f2r2.setFont(new java.awt.Font("Mistral", 1, 24)); // NOI18N
        f2r2.setText("Room 2");
        f2r2.setEnabled(false);
        f2r2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f2r2ActionPerformed(evt);
            }
        });

        f2r3.setBackground(new java.awt.Color(255, 211, 182));
        f2r3.setFont(new java.awt.Font("Mistral", 1, 24)); // NOI18N
        f2r3.setText("Room 3");
        f2r3.setEnabled(false);
        f2r3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f2r3ActionPerformed(evt);
            }
        });

        removeBtn.setBackground(new java.awt.Color(255, 211, 182));
        removeBtn.setFont(new java.awt.Font("Mistral", 1, 24)); // NOI18N
        removeBtn.setText("REMOVE");
        removeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeBtnActionPerformed(evt);
            }
        });

        saveBtn.setBackground(new java.awt.Color(255, 211, 182));
        saveBtn.setFont(new java.awt.Font("Mistral", 1, 24)); // NOI18N
        saveBtn.setText("SAVE");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
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

        icpassport.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        icpassport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                icpassportActionPerformed(evt);
            }
        });
        icpassport.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                icpassportKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Customer IC / Passport:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Name:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("Email:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("Contact Number:");

        goBtn.setBackground(new java.awt.Color(255, 211, 182));
        goBtn.setFont(new java.awt.Font("Mistral", 1, 24)); // NOI18N
        goBtn.setText("GO");
        goBtn.setEnabled(false);
        goBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBtnActionPerformed(evt);
            }
        });

        email.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        email.setText("<variable>");

        name.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        name.setText("<variable>");

        contact.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        contact.setText("<variable>");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setText("Start Date:");

        startDate.setEnabled(false);

        endDate.setEnabled(false);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel12.setText("End Date:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel13.setText("Booking ID:");

        bookingid.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bookingid.setText("<variable>");

        searhbtn.setBackground(new java.awt.Color(255, 211, 182));
        searhbtn.setFont(new java.awt.Font("Mistral", 1, 24)); // NOI18N
        searhbtn.setText("Search Room");
        searhbtn.setEnabled(false);
        searhbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searhbtnActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel14.setText("Paid:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel15.setText("Total Amount:");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel16.setText("Balance:");

        totalAmount.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        totalAmount.setText("<variable>");

        balance.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        balance.setText("<variable>");

        paidAmount.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        paidAmount.setEnabled(false);
        paidAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paidAmountActionPerformed(evt);
            }
        });
        paidAmount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                paidAmountKeyPressed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel17.setText("Room:");

        roomSelected.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        roomSelected.setText("<variable>");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel18.setText("Floor:");

        floorSelected.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        floorSelected.setText("<variable>");

        print.setBackground(new java.awt.Color(255, 211, 182));
        print.setFont(new java.awt.Font("Mistral", 1, 24)); // NOI18N
        print.setText("PRINT");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(searhbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(startDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(bookingid)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(endDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(306, 306, 306))
                    .addComponent(name)
                    .addComponent(email)
                    .addComponent(contact)
                    .addComponent(paidAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalAmount)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(icpassport, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(goBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(balance))
                .addGap(127, 127, 127)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(f1r5, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(32, 32, 32)
                                            .addComponent(f1r10, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(f1r4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(f1r3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(f1r2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(f1r1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(32, 32, 32)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(f1r9, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(f1r8, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(f1r7, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(f1r6, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(jLabel1))
                                .addGap(42, 42, 42))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(f2r5, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(32, 32, 32)
                                    .addComponent(f2r10, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(f2r4, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(f2r3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(f2r2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(f2r1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(32, 32, 32)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(f2r9, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(f2r8, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(f2r7, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(f2r6, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(print, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(28, 28, 28)
                                    .addComponent(removeBtn)
                                    .addGap(18, 18, 18)
                                    .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel3)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(floorSelected)
                            .addComponent(roomSelected))))
                .addGap(139, 139, 139))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(removeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(print, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bookingid, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(icpassport, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(goBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(76, 76, 76))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addGap(27, 27, 27)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(f2r1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(f1r6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(f1r1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(f2r2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(f2r3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(f2r4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(f2r6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(f2r7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(f2r8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(f2r9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(f2r10, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(f1r7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(f1r8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(f1r9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(f1r2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(contact, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(78, 78, 78)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(f1r3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(f1r4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(startDate, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(endDate, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(searhbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(totalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(f1r5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(f1r10, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(f2r5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(roomSelected, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(paidAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(floorSelected, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(balance, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(128, 128, 128))))
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
    private void refreshTotalPaidAndBalance(){
        this.totalAmount.setText(String.valueOf(booking.getTotalAmount()));
        this.balance.setText(String.valueOf(booking.getBalance()));;
    }
    
    
    private void createNewBooking(int r,int floor){
        Room room = HotelManagement.roomHandler.getRoom(floor, r);
        LocalDate start_date = this.startDate.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate end_date = this.endDate.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        Booking b = new Booking(this.bookingid.getText(),room,start_date,end_date,customer);
        this.roomSelected.setText(String.valueOf(r));
        this.floorSelected.setText(String.valueOf(floor));
        this.booking = b;
        refreshTotalPaidAndBalance();

        
    }
    
    private void f1r1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f1r1ActionPerformed
        createNewBooking(1,1);
    }//GEN-LAST:event_f1r1ActionPerformed

    private void f1r2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f1r2ActionPerformed
        createNewBooking(2,1);
    }//GEN-LAST:event_f1r2ActionPerformed

    private void f1r3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f1r3ActionPerformed
        createNewBooking(3,1);
    }//GEN-LAST:event_f1r3ActionPerformed

    private void f1r4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f1r4ActionPerformed
        createNewBooking(4,1);
    }//GEN-LAST:event_f1r4ActionPerformed

    private void f1r9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f1r9ActionPerformed
        createNewBooking(9,1);
    }//GEN-LAST:event_f1r9ActionPerformed

    private void f1r8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f1r8ActionPerformed
        createNewBooking(8,1);
    }//GEN-LAST:event_f1r8ActionPerformed

    private void f1r7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f1r7ActionPerformed
        createNewBooking(7,1);
    }//GEN-LAST:event_f1r7ActionPerformed

    private void f1r6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f1r6ActionPerformed
        createNewBooking(6,1);
    }//GEN-LAST:event_f1r6ActionPerformed

    private void f1r5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f1r5ActionPerformed
        createNewBooking(5,1);
    }//GEN-LAST:event_f1r5ActionPerformed

    private void f1r10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f1r10ActionPerformed
        createNewBooking(10,1);
    }//GEN-LAST:event_f1r10ActionPerformed

    private void f2r5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f2r5ActionPerformed
        createNewBooking(5,2);
    }//GEN-LAST:event_f2r5ActionPerformed

    private void f2r10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f2r10ActionPerformed
        createNewBooking(10,2);
    }//GEN-LAST:event_f2r10ActionPerformed

    private void f2r4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f2r4ActionPerformed
        createNewBooking(4,2);
    }//GEN-LAST:event_f2r4ActionPerformed

    private void f2r9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f2r9ActionPerformed
        createNewBooking(9,2);
    }//GEN-LAST:event_f2r9ActionPerformed

    private void f2r8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f2r8ActionPerformed
        createNewBooking(8,2);
    }//GEN-LAST:event_f2r8ActionPerformed

    private void f2r7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f2r7ActionPerformed
        createNewBooking(7,2);
    }//GEN-LAST:event_f2r7ActionPerformed

    private void f2r6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f2r6ActionPerformed
        createNewBooking(6,1);
    }//GEN-LAST:event_f2r6ActionPerformed

    private void f2r1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f2r1ActionPerformed
        createNewBooking(1,2);
    }//GEN-LAST:event_f2r1ActionPerformed

    private void f2r2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f2r2ActionPerformed
        createNewBooking(2,2);
    }//GEN-LAST:event_f2r2ActionPerformed

    private void f2r3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f2r3ActionPerformed
        createNewBooking(3,2);
    }//GEN-LAST:event_f2r3ActionPerformed

    private void removeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeBtnActionPerformed
        
        LocalDate s_b = booking.getStartDate();
        LocalDate e_b = booking.getEndDate();
        List<LocalDate> dates = Stream.iterate(s_b, date -> date.plusDays(1)).limit(ChronoUnit.DAYS.between(s_b, e_b)).collect(Collectors.toList());
        dates.forEach(dd -> {
            booking.getRoom().removeReserved(dd);
        });
        
        HotelManagement.bookingHandler.removeBooking(this.booking.getBookingID());
        this.dispose();
        new BookingList(staff).setVisible(true);
        
    }//GEN-LAST:event_removeBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        this.dispose();
        new BookingList(this.staff).setVisible(true);
    }//GEN-LAST:event_backBtnActionPerformed

    private void icpassportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_icpassportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_icpassportActionPerformed

    private void goBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBtnActionPerformed
        if(this.icpassport.isEnabled()){
            Customer customer = HotelManagement.customerHandler.getCustomer(icpassport.getText());
            if(customer == null){
                HotelManagement.errorMesg("Please enter a valid customer ic or passport.", "Invalid customer.");
                return;
            }
            this.refreshCustomerDetail(customer);
            this.startDate.setEnabled(true);
            this.endDate.setEnabled(true);
            this.customer = customer;
            
           
        }
    }//GEN-LAST:event_goBtnActionPerformed

    private void icpassportKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_icpassportKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){ // when enter is pressed = btnLogin
            goBtn.doClick();
        }
    }//GEN-LAST:event_icpassportKeyPressed

    private void searhbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searhbtnActionPerformed
        if(this.startDate.getDate() != null && this.endDate.getDate() != null){
            refreshRoom();


        }
    }//GEN-LAST:event_searhbtnActionPerformed

    private void paidAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paidAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paidAmountActionPerformed

    private void paidAmountKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_paidAmountKeyPressed
        if(this.paidAmount.isEnabled()){
            if (evt.getKeyCode() == KeyEvent.VK_ENTER){ // when enter is pressed = btnLogin
                if(this.handler.getBookings().containsKey(this.booking.getBookingID())){
                    int n = JOptionPane.showConfirmDialog(null, "Would you want to change the total paid?", "Booking Manage", JOptionPane.YES_NO_OPTION);
                    if (n == JOptionPane.YES_OPTION) {
                        this.booking.setTotalPaid(Double.valueOf(this.paidAmount.getText()));
                        this.refreshTotalPaidAndBalance();
                        JOptionPane.showMessageDialog(null, "Successfully update the information.", "Booking Manage", JOptionPane.INFORMATION_MESSAGE);
                    }      
                }
                this.booking.setTotalPaid(Double.valueOf(this.paidAmount.getText()));
                this.refreshTotalPaidAndBalance(); 
                
                
                
            }
            
        }
    }//GEN-LAST:event_paidAmountKeyPressed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        if(this.balance.getText() != null){
            double b = Double.valueOf(this.balance.getText());
            if(b > 0){
                //proceed
                
                LocalDate start_date = this.startDate.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                LocalDate end_date = this.endDate.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                List<LocalDate> dates = Stream.iterate(start_date, date -> date.plusDays(1)).limit(ChronoUnit.DAYS.between(start_date, end_date)).collect(Collectors.toList());
                
                dates.forEach(dd -> {
                    this.booking.getRoom().addReserved(dd);
                });
                
                handler.addBooking(booking);

                this.dispose();
                
                
                BookingList bl = new BookingList(this.staff);
                
                bl.setVisible(true);
                
               HotelManagement.errorMesg("Successfully create new booking.", "Successfully");
                this.booking.print();

                
            }else{
                HotelManagement.errorMesg("Balance cannot be less than 0 ", "Balance");
            }
        }
    }//GEN-LAST:event_saveBtnActionPerformed

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
        this.booking.print();
    }//GEN-LAST:event_printActionPerformed

    private void refreshRoom(){
        LocalDate start_date = this.startDate.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate end_date = this.endDate.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        if(ChronoUnit.DAYS.between(start_date, end_date) < 0){
            HotelManagement.errorMesg("Please choose a valid date.", "Search Date");
            return;
        }
        
        List<LocalDate> dates = Stream.iterate(start_date, date -> date.plusDays(1)).limit(ChronoUnit.DAYS.between(start_date, end_date)).collect(Collectors.toList());
        RoomHandler roomHandler = HotelManagement.roomHandler;
        roomHandler.getRooms().forEach(room -> {
            boolean e = true;
            for(LocalDate d : dates){
                if(room.getRoomReserved().contains(d)){
                    e = false;
                }
                
            }
            if (e) {
                switch(room.getFloor()){
                    case 1 -> {
                        switch(room.getRoomNumber()){
                            case 1 -> this.f1r1.setEnabled(true);
                            case 2 -> this.f1r2.setEnabled(true);
                            case 3 -> this.f1r3.setEnabled(true);
                            case 4 -> this.f1r4.setEnabled(true);
                            case 5 -> this.f1r5.setEnabled(true);
                            case 6 -> this.f1r6.setEnabled(true);
                            case 7 -> this.f1r7.setEnabled(true);
                            case 8 -> this.f1r8.setEnabled(true);
                            case 9 -> this.f1r9.setEnabled(true);
                            case 10 -> this.f1r10.setEnabled(true);
                                     
                        }
                    }

                    case 2 -> {
                        switch(room.getRoomNumber()){
                            case 1 -> this.f2r1.setEnabled(true);
                            case 2 -> this.f2r2.setEnabled(true);
                            case 3 -> this.f2r3.setEnabled(true);
                            case 4 -> this.f2r4.setEnabled(true);
                            case 5 -> this.f2r5.setEnabled(true);
                            case 6 -> this.f2r6.setEnabled(true);
                            case 7 -> this.f2r7.setEnabled(true);
                            case 8 -> this.f2r8.setEnabled(true);
                            case 9 -> this.f2r9.setEnabled(true);
                            case 10 -> this.f2r10.setEnabled(true);
                                     
                        }
                    }
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel balance;
    private javax.swing.JLabel bookingid;
    private javax.swing.JLabel contact;
    private javax.swing.JLabel email;
    private com.toedter.calendar.JDateChooser endDate;
    private javax.swing.JButton f1r1;
    private javax.swing.JButton f1r10;
    private javax.swing.JButton f1r2;
    private javax.swing.JButton f1r3;
    private javax.swing.JButton f1r4;
    private javax.swing.JButton f1r5;
    private javax.swing.JButton f1r6;
    private javax.swing.JButton f1r7;
    private javax.swing.JButton f1r8;
    private javax.swing.JButton f1r9;
    private javax.swing.JButton f2r1;
    private javax.swing.JButton f2r10;
    private javax.swing.JButton f2r2;
    private javax.swing.JButton f2r3;
    private javax.swing.JButton f2r4;
    private javax.swing.JButton f2r5;
    private javax.swing.JButton f2r6;
    private javax.swing.JButton f2r7;
    private javax.swing.JButton f2r8;
    private javax.swing.JButton f2r9;
    private javax.swing.JLabel floorSelected;
    private javax.swing.JButton goBtn;
    private javax.swing.JTextField icpassport;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel name;
    private javax.swing.JTextField paidAmount;
    private javax.swing.JButton print;
    private javax.swing.JButton removeBtn;
    private javax.swing.JLabel roomSelected;
    private javax.swing.JButton saveBtn;
    private javax.swing.JButton searhbtn;
    private com.toedter.calendar.JDateChooser startDate;
    private javax.swing.JLabel totalAmount;
    private javax.swing.JTextField usernameTxt;
    // End of variables declaration//GEN-END:variables
}
