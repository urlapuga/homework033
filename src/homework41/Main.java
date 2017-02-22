package homework41;

/**
 * Created by Андрей on 22.02.2017.
 */
public class Main {
    public static void main(String[] args) {

        USBank usbank = new USBank("US",Currency.USD,1,5,1,100000);
        EUBank eubank = new EUBank("EU",Currency.EUR,1,5,1,100000);
        ChinaBank chbank = new ChinaBank("CH",Currency.EUR,1,5,1,100000);

        User user1 = new User("userName1", 10000, 1, "company1", 10,usbank);
        User user2 = new User("userName2", 10000, 1, "company1", 10,usbank);

        User user3 = new User("userName3", 10000, 1, "company1", 10,eubank);
        User user4 = new User("userName4", 10000, 1, "company1", 10,eubank);

        User user5 = new User("userName5", 10000, 1, "company1", 10,chbank);
        User user6 = new User("userName6", 10000, 1, "company1", 10,chbank);

    });
    }
}
