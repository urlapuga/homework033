package Homework5;

import Homework5.API;

/**
 * Created by Андрей on 02.03.2017.
 */
public class BookingComAPI implements API {
    private java.util.Calendar cal = java.util.Calendar.getInstance();
    private Room[] rooms = new Room[5];
    public BookingComAPI(){
        cal.set(2016, 00, 10);

        rooms[0] = new Room(1,2,cal.getTime(),"kiev","president");
        rooms[1] = new Room(2,3,cal.getTime(),"kiev","president");
        rooms[2] = new Room(3,4,cal.getTime(),"kiev","president");
        rooms[3] = new Room(4,5,cal.getTime(),"kiev","president");
        rooms[4] = new Room(5,6,cal.getTime(),"kiev","president");
    }
    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {

        return rooms;
    }
}

