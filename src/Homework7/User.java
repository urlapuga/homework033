package Homework7;

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

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCity() {
        return city;
    }

    public int getBalance() {
        return balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;

        if (id != user.id) return false;
        if (balance != user.balance) return false;
        if (!firstName.equals(user.firstName)) return false;
        if (!lastName.equals(user.lastName)) return false;
        return city.equals(user.city);
    }

    @Override
    public int hashCode() {
        int result = (int) (31 + id);
        result = 31 * result + firstName.hashCode();
        result = 31 * result + lastName.hashCode();
        result = 31 * result + city.hashCode();
        result = 31 * result + balance;
        return result;
    }


}
