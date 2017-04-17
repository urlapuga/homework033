package Homework6;

/**
 * Created by Андрей on 09.03.2017.
 */
public class User {
    private long id;
    private String firstName;
    private String lastName;
    private int salary;
    private int balance;

    public User(long id, String firstName, String lastName, int salary, int balance) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.balance = balance;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return this.firstName + " " + this.lastName + "balance " + this.balance;
    }

    public boolean equals(User user) {
        if(user==null)return false;
        if (this.firstName.equals(user.firstName) &&this.lastName.equals(user.lastName)
                && this.salary==user.salary && this.balance==user.balance)return true;
        return false;
    }
}
