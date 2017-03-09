package Homework6;

/**
 * Created by Андрей on 09.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        User[] users = new User[5];
        users[0] = new User(1,"firstName","lastName1",1,100);
        users[1] = new User(2,"secondName","lastName2",2,100);
        users[2] = new User(3,"thirdName","lastName3",3,100);
        users[3] = new User(4,"fourthName","lastName4",4,100);
        users[4] = new User(5,"fifthName","lastName5",5,100);
        UserUtils.uniqueUsers(users);
    }
}
