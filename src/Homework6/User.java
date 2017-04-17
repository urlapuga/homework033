package Homework6;

/**
 * Created by Андрей on 09.03.2017.
 */
public class User {
    long id;
    String firstName;
    String lastName;
    int salary;
    int balance;

    public User(long id, String firstName, String lastName, int salary, int balance) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return this.firstName + " " + this.lastName + "balance " + this.balance;
    }

    public boolean equals(User user) {
        if (this.firstName.equals(user.firstName) &&this.lastName.equals(user.lastName)
                && this.salary==user.salary && this.balance==user.balance)return true;
        return false;
    }
}
