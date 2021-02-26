package com.teyjiarong.hotelmanagement.customer;

public class Customer {
    
    private String name;
    private final String ICPassport;
    private String contactNumber;
    private String email;
    
    public Customer(String name,String ICPassport,String contactNumber,String email){
        this.name = name;
        this.ICPassport = ICPassport;
        this.contactNumber = contactNumber;
        this.email = email;
        
    }

    public String getName() {
        return name;
    }

    public String getICPassport() {
        return ICPassport;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
