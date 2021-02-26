/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teyjiarong.hotelmanagement;

import com.teyjiarong.hotelmanagement.booking.Booking;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import java.awt.print.PrinterException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author user
 */
public class BillPrintable implements Printable{
    
    private Booking bill;
    
    public BillPrintable(Booking bill){
        this.bill = bill;

    }
    
    public int print(Graphics grahpics,PageFormat pageFormat,int pageIndex )
    throws PrinterException
    {
        int result = NO_SUCH_PAGE;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
        LocalDateTime now = LocalDateTime.now();  
        if(pageIndex == 0){
            Graphics2D g2d = (Graphics2D) grahpics;
            double width = pageFormat.getImageableWidth();
            g2d.translate((int)pageFormat.getImageableX(), (int)pageFormat.getImageableY());
            try {
                int y = 20;
                int yShift = 10;
                int headerRectHeight = 15;
                
                g2d.setFont(new Font("Monospaced", Font.PLAIN,9));
                g2d.drawString("--------------------------------------------", 12,y); y+= yShift;
                g2d.drawString("            APU HOTEL SDN BHD           ", 12,y); y+= yShift;
                g2d.drawString("            Jalan Teknologi 5,          ", 12,y); y+= yShift;
                g2d.drawString("       Taman Teknologi Malaysia,        ", 12,y); y+= yShift;
                g2d.drawString("           57000 Kuala Lumpur           ", 12,y); y+= yShift;
                g2d.drawString("--------------------------------------------", 12,y); y+= yShift;
                g2d.drawString("   BookingID: " + this.bill.getBookingID(), 12,y); y+= yShift;
                g2d.drawString("   Date: " + dtf.format(now), 12,y); y+= yShift;
                g2d.drawString("--------------------------------------------", 12,y); y+= yShift;


                g2d.drawString("   Item Name                  Price      ", 12,y); y+= yShift;
                g2d.drawString("    "+this.bill.getRoom().getRoomNumber()+"                        RM"+this.bill.getTotalAmountRoom(), 12,y); y+= yShift;

                g2d.drawString("--------------------------------------------", 12,y); y+= yShift;
                g2d.drawString("    Room: "+this.bill.getRoom().getRoomNumber(), 12,y); y+= yShift;
                g2d.drawString("    Floor: "+this.bill.getRoom().getFloor(), 12,y); y+= yShift;
                g2d.drawString("    Days: "+this.bill.getTotalDays(), 12,y); y+= yShift;
                g2d.drawString("Services fees(10%)           RM"+this.bill.getServicesTax(), 12,y); y+= yShift;
                g2d.drawString("Tourism Charge               RM "+this.bill.getTourismCharge(), 12,y); y+= yShift;


                int size = 17;
                String space ="";
                for(int i =0;i<size;i++){
                    space+= " ";
                }
                g2d.drawString("--------------------------------------------", 12,y); y+= yShift;
                g2d.drawString(" TotalAmount"+space+"RM"+ this.bill.getTotalAmount() , 12,y); y+= yShift;
                g2d.drawString("--------------------------------------------", 12,y); y+= yShift;
                space = "";
                size = 24;
                for(int i =0;i<size;i++){
                    space += " ";
                }
                
                g2d.drawString(" Cash"+space+"RM"+ this.bill.getTotalPaid(), 12,y); y+= yShift;
                g2d.drawString("--------------------------------------------", 12,y); y+= yShift;
                space = "";
                size = 21;
                for(int i =0;i<size;i++){
                    space += " ";
                }
                
                g2d.drawString(" Balance"+space+"RM"+ this.bill.getBalance() +" ", 12,y); y+= yShift;
                g2d.drawString("                                            ", 12,y); y+= yShift;

                g2d.drawString("********************************************", 12,y); y+= yShift;
                g2d.drawString("          THANK YOU COME AGAIN            ", 12,y); y+= yShift;
                g2d.drawString("********************************************", 12,y); y+= yShift;
                g2d.drawString("           SOFTWARE BY: TEY               ", 12,y); y+= yShift;
                g2d.drawString("         Contact: 03-910022030            ", 12,y); y+= yShift;

            
            }catch(Exception e){
                System.out.println(e);
            }
            result = PAGE_EXISTS;
        }
        
        return result;
    }
    
}
