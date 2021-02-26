package com.teyjiarong.hotelmanagement.room;

import java.util.ArrayList;
import java.util.List;

public final class RoomHandler {
    
    private final ArrayList<Room> rooms;
    
    public RoomHandler(){
        this.rooms = new ArrayList<>();
        this.loadRoomData();
    }
    
    public Room getRoom(int floor, int number){
        for(int i=0;i<rooms.size();i++){
            if(rooms.get(i).getFloor() == floor && rooms.get(i).getRoomNumber() == number){
                return rooms.get(i);
            }
        }
        return null;
    }
    
    public boolean addRoom(Room room){
        this.rooms.add(room);
        return true;
    }
    
    public List<Room> getRooms(){
        return this.rooms;
    }
    
    public void shutdown(){
        this.rooms.clear();
    }
    
    public void loadRoomData(){
        int totalRoom = 20;
        int floor = 2;
        
        // To get how many rooms in a floor
        int totalRoomFloor = totalRoom / floor;
        
        for(int f = 1;f<=floor;f++){
            for(int r = 1;r<=totalRoomFloor;r++){
                this.rooms.add(new Room(f,r));
            }
            
        }
        
        
        
    }
    
}
