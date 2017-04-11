package Homework9;

public class User {
    private long id;
    private String firstName;
    private String lastName;
    private Cities city;
    private int balance;

    public User(String firstName, String lastName, Cities city, int balance) {
        this.id = 1;
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;

        User user = (User) o;
        return (id != user.id) ? false : (balance != user.balance) ? false : (!firstName.equals(user.firstName)) ? false : (!lastName.equals(user.lastName)) ? false : (!city.equals(user.city)) ? false : true;

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Cities getCity() {
        return city;
    }

    public int getBalance() {
        return balance;
    }
}
