package com.teyjiarong.hotelmanagement.staff;

public class Staff {
    private final String username;
    private String password;
    
    private String fullName;

    
    public Staff(String username, String password, String fullName){
        this.username = username;
        this.password = password;
        this.fullName = fullName;
    }


    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }


}
