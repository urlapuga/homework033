package Homework5;

/**
 * Created by Андрей on 02.03.2017.
 */
public class Main
{
    public static void main(String[] args)
    {
        RoomSystem roomSystem = new RoomSystem();
        Room[] rooms = roomSystem.getRoomList();
        roomSystem.findRoomsWithApi(1,1,"kiev","kiev");

    }
}
