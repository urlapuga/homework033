package Homework5;

import Homework5.API;
import Homework5.Room;

/**
 * Created by Андрей on 02.03.2017.
 */
public class GoogleAPI implements API {
    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        Room[] temp = new Room[0];
        Room[] rooms = Rooms.getRooms();
        for (Room room : rooms) {
            if (room.getPrice() == price && room.getPersons() == persons && room.getCityName() == city && room.getHotelName() == hotel) {
            temp[temp.length]=room;
            }
        }
        return temp;
    }
}

