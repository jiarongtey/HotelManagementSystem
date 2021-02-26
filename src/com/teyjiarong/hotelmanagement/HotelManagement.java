package com.teyjiarong.hotelmanagement;

import com.teyjiarong.hotelmanagement.booking.BookingHandler;
import com.teyjiarong.hotelmanagement.customer.CustomerHandler;
import com.teyjiarong.hotelmanagement.gui.Login;
import com.teyjiarong.hotelmanagement.room.RoomHandler;
import com.teyjiarong.hotelmanagement.staff.StaffHandler;
import java.awt.Toolkit;
import java.sql.*;
import javax.swing.JOptionPane;

public class HotelManagement {

    public static StaffHandler staffHandler;
    public static RoomHandler roomHandler;
    public static CustomerHandler customerHandler;
    public static BookingHandler bookingHandler;
    public final static Runnable runnable =
     (Runnable) Toolkit.getDefaultToolkit().getDesktopProperty("win.sound.exclamation"); // error sound
    
    public static void errorMesg(String mesg,String title){
        runnable.run(); 
        JOptionPane.showMessageDialog(null, mesg, title, JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static void main(String[] args) {
        roomHandler = new RoomHandler();
        staffHandler = new StaffHandler();
        customerHandler = new CustomerHandler();
        bookingHandler = new BookingHandler();

        try {

          Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hms","root","");
          Statement st = con.createStatement();

          staffHandler.loadDatabase(con,st);
          customerHandler.loadDatabase(con, st);
          bookingHandler.loadDatabase(con, st);

        }catch (SQLException ex) {
          System.out.println(ex);
        }
        new Login().setVisible(true);
        
            
    
        Runtime.getRuntime().addShutdownHook(new Thread()
        {
            @Override
            public void run()
            {
                saveObject();
            }
        });
    }
    
  
    public static void saveObject(){
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hms","root","");
            Statement st = con.createStatement();
            
            customerHandler.saveDatabase(con, st);
            bookingHandler.saveDatabase(con, st);
            
        }catch(SQLException ex){
            System.out.println(ex);
        }
    }
}
