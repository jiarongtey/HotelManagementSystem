package com.teyjiarong.hotelmanagement.customer;

import com.teyjiarong.hotelmanagement.HotelManagement;
import com.teyjiarong.hotelmanagement.booking.Booking;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerHandler {
    
    private final HashMap<String, Customer> customers;
 
    public CustomerHandler(){
        this.customers = new HashMap<>();
    }
    
    public Customer getCustomer(String icNumber){
        return this.customers.get(icNumber);
    }
    
    public Customer getCustomerByName(String name){
        for(Map.Entry m : customers.entrySet()){
            Customer c = (Customer) m.getValue();
            if(name.equals(c.getName())){
                return c;
            }
        }
        return null;
    }
    
    public boolean addCustomer(Customer c){
        this.customers.put(c.getICPassport(), c);
        return true;
    }
    
    public HashMap<String,Customer> getCustomers(){
        return this.customers;
    }
    
    public boolean removeCustomer(String pass){
        if(this.customers.containsKey(pass)){
            
            Customer customer = getCustomer(pass);
            List<Booking> cBooking = HotelManagement.bookingHandler.getCustomerBookings(customer);
            for(Booking b: cBooking){
                HotelManagement.bookingHandler.removeBooking(b.getBookingID());
            }
            this.customers.remove(pass);
            return true;
        }else{
            return false;
        }
    }
    
    public void shutdown(){
        this.customers.clear();
    }
    
    public void loadDatabase(Connection con, Statement st) throws SQLException{
        
        String query = "SELECT * FROM customer";
        ResultSet rs = st.executeQuery(query); 
           
        while(rs.next()){
               
            String icPassport = rs.getString("ICPassport");
            String name = rs.getString("name");
            String contact_number = rs.getString("contact_number");
            String email = rs.getString("email");
            
            Customer c = new Customer(name,icPassport,contact_number,email);

            addCustomer(c);
                
        }

    }
    
    public void saveDatabase(Connection con, Statement st) throws SQLException{
        
        String query = "DELETE FROM customer";
        
        st.executeUpdate(query); 
        if(this.customers.isEmpty()){
            return;
        }
        int i = 0;
        String s = "INSERT INTO customer(ICPassport,name,contact_number,email) VALUES('";
        
        for(Map.Entry m :this.customers.entrySet()){
            Customer c = (Customer) m.getValue();
            if(i != 0){
                s += ",('";
            }
            s += c.getICPassport() + "','"+c.getName()+"','"+c.getContactNumber() + "','" + c.getEmail()  +"')";
            i++;
        }

        st.executeUpdate(s);

    }
    
    
}
