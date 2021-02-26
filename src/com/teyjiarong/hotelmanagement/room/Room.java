package com.teyjiarong.hotelmanagement.room;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Room {
    
    private final int floor;
    private final int roomNumber;
    private final List<LocalDate> reserved;

    public Room(int floor,int roomNumber){
        this.floor = floor;
        this.roomNumber =  roomNumber;    
        this.reserved = new ArrayList<>();
    }

    public int getFloor() {
        return floor;
    }
    
    public int getRoomNumber(){
        return this.roomNumber;
    }
    
    public void addReserved(LocalDate d){
        this.reserved.add(d);
    }
    
    public void clear(){
        this.reserved.clear();
    }
    
    public boolean removeReserved(LocalDate date){
        if(this.reserved.contains(date)){
            this.reserved.remove(date);
            return true;
        }else{
            return false;
        }
    }
    
    public List<LocalDate> getRoomReserved(){
        return this.reserved;
    }
    
    

}
