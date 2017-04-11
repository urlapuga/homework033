package homework41;

/**
 * Created by Андрей on 22.02.2017.
 */
public class Main {

    static BankSystem bankSystem;
    static User[] users;

    public static void main(String[] args) {


        Bank usbank = new USBank("US", Currency.USD, 1, 5, 1, 100000);
        Bank eubank = new EUBank("EU", Currency.EUR, 1, 5, 1, 100000);
        Bank chbank = new ChinaBank("CH", Currency.EUR, 1, 5, 1, 100000);


        users[1] = new User("userName1", 10000, 1, "company1", 10, (Bank)usbank);
        users[2] = new User("userName2", 10000, 1, "company1", 10, usbank);

        users[3] = new User("userName3", 10000, 1, "company1", 10, eubank);
        users[4] = new User("userName4", 10000, 1, "company1", 10, eubank);

        users[5] = new User("userName5", 10000, 1, "company1", 10, chbank);
        users[6] = new User("userName6", 10000, 1, "company1", 10, chbank);

        for (User user : users) {
            bankSystem.fundUser(user, 10);
            System.out.println(user.getBalance());
        }

        for (User user : users) {
            bankSystem.paySalary(user);
            System.out.println(user.getBalance());
        }

        System.exit(0);
    }

}
