package com.teyjiarong.hotelmanagement.booking;

import com.teyjiarong.hotelmanagement.BillPrintable;
import com.teyjiarong.hotelmanagement.customer.Customer;
import com.teyjiarong.hotelmanagement.room.Room;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class Booking {
    
    //Primary key
    private final String bookingID;
    private Room room;
    private LocalDate startDate;
    private LocalDate endDate;
    private final Customer customer;
    private double paidAmount;

    public double getTotalPaid() {
        return paidAmount;
    }

    public void setTotalPaid(double totalPaid) {
        this.paidAmount = totalPaid;
    }
    
    //Create a booking that is included payment
    public Booking(String bookingID, Room room,LocalDate sDate, LocalDate eDate,Customer customer,double paidAmount){    
        this.bookingID = bookingID;
        this.room = room;
        this.startDate = sDate;
        this.endDate = eDate;
        this.customer = customer;
        this.paidAmount = paidAmount;
    }
    
    //Create a booking that is haven't made the payment. (To calculate the total)
    public Booking(String bookingID, Room room,LocalDate sDate, LocalDate eDate,Customer customer){    
        this.bookingID = bookingID;
        this.room = room;
        this.startDate = sDate;
        this.endDate = eDate;
        this.customer = customer;
        this.paidAmount = 0.0;
    }
    
    
    
    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
    
    public String getBookingID(){
        return this.bookingID;
    }
    
    public Customer getCustomer(){
        return this.customer;
    }
    
    public long getTotalDays(){
        return ChronoUnit.DAYS.between(getStartDate(),getEndDate());
    }   
    
    // Bill
    
    public double getTotalAmountRoom(){
        long days = getTotalDays();
        return 350 * days;
    }
    
    public double getTotalAmount(){
        long days = getTotalDays();
        double daysCharge = 350 * days;
        double serviceTax = daysCharge * 0.1;
        double tourismFees = days * 10;
        
        
        return daysCharge + serviceTax + tourismFees;
    }
    
    public double getBalance(){
        return this.paidAmount -  getTotalAmount();    
    }
    
    public double getServicesTax(){
        return getTotalAmountRoom() * 0.1;
    }
    
    public double getTourismCharge(){
        return getTotalDays() * 10;
    }
   
    public void print(){
        PrinterJob pj = PrinterJob.getPrinterJob();
        pj.setPrintable(new BillPrintable(this),getPageFormat(pj));

        try{
            pj.print();
        }catch(PrinterException e){
            System.out.println(e);
        }
    }
    private PageFormat getPageFormat(PrinterJob pj){
        pj.setJobName(this.bookingID);
        PageFormat pf = pj.defaultPage();
        Paper paper = pf.getPaper();
        
        double bodyHeight = 10;
        double headerHeight = 10.0;
        double footerHeight = 5.0;
        double width = cm_to_pp(8);
        double height = cm_to_pp(headerHeight+bodyHeight+footerHeight);
        paper.setSize(width, height);
        paper.setImageableArea(0, 10, width, height-cm_to_pp(1));
        pf.setOrientation(PageFormat.PORTRAIT);
        pf.setPaper(paper);
        
        return pf;
        
    }
    
    protected double cm_to_pp(double cm){
        return toPPI(cm * 0.393600787);
    }
    
    protected double toPPI(double inch){
        return inch * 72d;
    }
    
    
}
