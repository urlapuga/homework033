package Homework5;

/**
 * Created by Андрей on 02.03.2017.
 */
public class Controller {
    private API apis[] = new API[3];
    public Controller() {
        apis[0] = new BookingComAPI();
        apis[1] = new GoogleAPI();
        apis[2] = new TripAdvisorAPI();
    }
    private Room[] requestRooms(int price, int persons, String city, String hotel) {
        return new Room[0];
    }

    public API[] getApis() {
        return apis;
    }

    private int check(API api1, API api2) {
        Room[] room1 = api1.findRooms(1,1,"kiev","hotelName");
        Room[] room2 = api2.findRooms(1,1,"kiev","hotelName");
        int count = 0;
        for (Room room:room2){
            for(Room room11:room1) {
            if(room11.equals(room))count++;
            }
            }
            return count;
        }



}
