package Homework5;

/**
 * Created by Андрей on 02.03.2017.
 */
public interface API {
    Room[] findRooms(int price, int persons, String city, String hotel);
}
