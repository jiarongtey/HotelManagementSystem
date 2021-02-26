package com.teyjiarong.hotelmanagement.booking;

import com.teyjiarong.hotelmanagement.HotelManagement;
import com.teyjiarong.hotelmanagement.customer.Customer;
import com.teyjiarong.hotelmanagement.room.Room;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookingHandler {
    
    private final HashMap<String, Booking> bookings;
    private int latestID;
    
    public BookingHandler(){
        this.bookings = new HashMap<>();
        latestID = 0;
    }
    
    public Booking getBooking(String bookingID){
        return this.bookings.get(bookingID);
    }
    
    public boolean addBooking(Booking b){
        this.bookings.put(b.getBookingID() ,b);
        int i = Integer.valueOf(b.getBookingID());
        if(i > latestID){
            this.latestID = i;
        }
        return true;
    }
    
    public HashMap<String,Booking> getBookings(){
        return this.bookings;
    }
    
    public boolean removeBooking(String b){
        if(this.bookings.containsKey(b)){
            this.bookings.remove(b);
            return true;
        }else{
            return false;
        }
    }
    
    public List<Booking> getCustomerBookings(Customer customer){
        List<Booking> l = new ArrayList<>();
        if(customer == null){
            return null;
        }
        if(!bookings.isEmpty()){
            for(Map.Entry m : bookings.entrySet()){
                if(((Booking)m.getValue()).getCustomer().equals(customer)){
                    l.add((Booking)m.getValue());
                }
            }
            
        }
        return l;
    }
    
    public void shutdown(){
        this.bookings.clear();
    }
    
    public void loadDatabase(Connection con, Statement st) throws SQLException{
        
        String query = "SELECT * FROM booking";
        ResultSet rs = st.executeQuery(query); 
           
        while(rs.next()){
               
            String bookingID = rs.getString("booking_id");
            int roomID = rs.getInt("room_id");
            LocalDate startDate = rs.getDate("start_date").toLocalDate();
            LocalDate endDate = rs.getDate("end_date").toLocalDate();
            String customerID = rs.getString("iCPassport");
            double totalPaid = rs.getDouble("total_paid");
            
            Room r = HotelManagement.roomHandler.getRooms().get(roomID);
            Customer c = HotelManagement.customerHandler.getCustomer(customerID);

            Booking newBooking = new Booking(bookingID,r,startDate,endDate,c,totalPaid);
            addBooking(newBooking);
                
        }
        
        this.bookings.entrySet().stream().map(m -> (Booking) m.getValue()).forEachOrdered(b -> {
            long days = ChronoUnit.DAYS.between(b.getStartDate(),b.getEndDate());
            for(int i=0;i<days; i++){
                LocalDate lc = b.getStartDate();
                b.getRoom().addReserved(lc.plusDays(i));
            }
        });
    }
    
    public void saveDatabase(Connection con, Statement st) throws SQLException{
        
        String query = "DELETE FROM booking";
        st.executeUpdate(query); 
        if(this.bookings.isEmpty()){
            return;
        }
        ZoneId defaultZoneId = ZoneId.systemDefault();
        
        int i = 0;
        String s = "INSERT INTO booking(booking_id,room_id,start_date,end_date,iCPassport,total_paid) VALUES('";

        for(Map.Entry m :this.bookings.entrySet()){
            Booking c = (Booking) m.getValue();
            if(i != 0){
                s += ",('";
            }
            int roomID = HotelManagement.roomHandler.getRooms().indexOf(c.getRoom());
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            
            String sdate = sdf.format(Date.from(c.getStartDate().atStartOfDay(defaultZoneId).toInstant()));
            String edate = sdf.format(Date.from(c.getEndDate().atStartOfDay(defaultZoneId).toInstant()));

            s += c.getBookingID() + "','"+roomID+"','"+sdate+ "','" + edate + "','"+ c.getCustomer().getICPassport() +"','" + c.getTotalPaid() + "')";
            i++;
        }
        st.executeUpdate(s);

    }
    
    public int generateNewBooking(){
        
        return this.latestID + 1;
    }
    
}
