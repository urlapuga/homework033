package Homework7;

/**
 * Created by Андрей on 23.03.2017.
 */
public class User {
    private long id;
    private String firstName;
    private String lastName;
    private String city;
    private int balance;

    public User(String firstName, String lastName, String city, int balance) {
        this.id = 1;
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.balance = balance;
    }
}
