package Homework6;

/**
 * Created by Андрей on 09.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        User[] users = new User[5];
        users[0] = new User(1,"firstName","lastName1",1,100);
        users[1] = new User(1,"firstName","lastName1",1,100);
        users[2] = new User(3,"thirdName","lastName3",3,100);
        users[3] = new User(4,"fourthName","lastName4",4,100);
        users[4] = new User(5,"fifthName","lastName5",5,100);


        System.out.println("unique users");
        for (User user:UserUtils.uniqueUsers(users)){
            System.out.println(user);
        }
        System.out.println("users by balance");
        for (User user:UserUtils.usersWithConditionalBalance(users,1)){
            System.out.println(user);
        }

        System.out.println("paying salary ");
        for (User user:UserUtils.paySalaryToUsers(users)){
            System.out.println(user);
        }
        System.out.println("getting ids");
        for (long id:UserUtils.getUsersId(users)){
            System.out.println(id);
        }
        System.out.println("deleting empty users");
        UserUtils.deleteEmptyUsers(users);
    }
}
