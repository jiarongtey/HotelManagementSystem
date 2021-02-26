package com.teyjiarong.hotelmanagement.staff;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

public class StaffHandler {
    
    private HashMap<String, Staff> staffs;
    
    public StaffHandler(){
        this.staffs = new HashMap<>();
    }
    
    public Staff getStaff(String username){
        return this.staffs.get(username);
    }
    
    public boolean addStaff(Staff staff){
        this.staffs.put(staff.getUsername(), staff);
        return true;
    }
    
    public HashMap<String,Staff> getStaffs(){
        return this.staffs;
    }
    
    public boolean removeStaff(String username){
        if(this.staffs.containsKey(username)){
            this.staffs.remove(username);
            return true;
        }else{
            return false;
        }
    }
    
    public void shutdown(){
        this.staffs.clear();
    }

    public void loadDatabase(Connection con, Statement st) throws SQLException {
        String query = "SELECT * FROM staff";
        ResultSet rs = st.executeQuery(query); 
           
        while(rs.next()){
               
            String username = rs.getString("username");
            String password = rs.getString("password");
            String full_name = rs.getString("full_name");

            

            Staff newStaff = new Staff(username,password,full_name);
            addStaff(newStaff);
                
        }
    }
    
}
