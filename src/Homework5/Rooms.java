package Homework5;

import java.util.Date;

/**
 * Created by Андрей on 02.03.2017.
 */
public class Rooms {
    private java.util.ArrayList<Room> roomList = new java.util.ArrayList<Room>();
    private java.util.Calendar cal = java.util.Calendar.getInstance();
    public Rooms() {
        cal.set(2016, 00, 10);
        roomList.add(new Room(1,1,1, cal.getTime(),"president","Kiev"));
        cal.set(2017, 00, 10);
        roomList.add(new Room(2,2,2, cal.getTime(),"president","Kiev"));
        cal.set(2017, 00, 10);
        roomList.add(new Room(3,3,3, cal.getTime(),"Kiev","Kiev"));
        cal.set(2017, 00, 10);
        roomList.add(new Room(4,4,4, cal.getTime(),"CoolHotelName","CoolCity"));
        cal.set(2017, 01, 1);
        roomList.add(new Room(4,4,4, cal.getTime(),"CoolHotelName","CoolCity"));
    }

    public boolean addRoom(Room room) {
        roomList.add(room);
        return true;
    }
    public int getLenghth(){
        return roomList.size();
    }

    public boolean delRoom(Room room) {
        int i = -1;
        for(Room temproom :roomList){
            i++;
            if(temproom.equals(room))roomList.remove(i);
        }
        return true;
    }

    public Room[] getRooms() {
        Room []dsf = new Room[roomList.size()];
        return (roomList.toArray(new Room[roomList.size()]));
    }

    public void setRooms(Room[] rooms) {
        for(Room room:rooms)roomList.add(room);
    }


}
