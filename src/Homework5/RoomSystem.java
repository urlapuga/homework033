package Homework5;

import java.sql.*;

public class RoomSystem {

    private static final String url = "jdbc:mysql://localhost:3306/db";
    private static final String user = "root";
    private static final String password = "";
    private static Connection con;
    private static Statement stmt;
    private static ResultSet rs;
    private Controller controller = new Controller();
    public RoomSystem() {

    }

    public void findRoomsWithApi(int price,int persons,String city,String hotel){
        API[] apis = controller.getApis();
        for(API api: apis){
            Room[] tempRoomsApi = api.findRooms(price,persons,city,hotel);
            for (Room room:tempRoomsApi){
                addRoom(room);
            }
        }
    }

    public void addRoom(Room room) {

        String query = "insert into rooms(price,persons,dateAwailableFrom,hotelName,cityName) VALUES(" +
                "" + room.getPrice() + "," + room.getPersons() + ",'" + room.getDateAvailableFrom() +
                "'," + room.getHotelName() + "," + room.getCityName() + ")";

        try {
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
            stmt.execute(query);

        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        } finally {
            closeConn();
        }

    }

    public Room[] getRoomList() {
        String query = "select * from rooms";
        Room[] room = new Room[5];

        try {
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);
            int i = -1;
            while (rs.next()) {
                i++;
                room[i] = new Room(rs.getInt("price"),rs.getInt("persons"),
                        rs.getDate("dateAwailableFrom"),rs.getString("hotelName"),
                        rs.getString("cityName"));
                System.out.println(rs.getString("hotelName"));
            }

        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        } finally {
            closeConn();
        }
        return room;
    }

    public void closeConn(){
        //close connection ,stmt and resultset here
        try {
            con.close();
        } catch (SQLException se) { /*can't do anything */ }
        try {
            stmt.close();
        } catch (SQLException se) { /*can't do anything */ }
        try {
            rs.close();
        } catch (SQLException se) { /*can't do anything */ }
    }

}
