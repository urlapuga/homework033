package Homework7;

import java.math.BigDecimal;
import java.util.*;


public class Main {
    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        users.add(new User("name1", "lastname1", "city1", 1));
        users.add(new User("name2", "lastname2", "city2", 2));
        users.add(new User("name3", "lastname3", "city3", 3));
        users.add(new User("name4", "lastname4", "city4", 4));
        users.add(new User("name5", "lastname5", "city5", 5));
        users.add(new User("name6", "lastname6", "city6", 6));
        users.add(new User("name7", "lastname7", "city7", 7));
        users.add(new User("name8", "lastname8", "city8", 8));
        users.add(new User("name9", "lastname9", "city9", 9));
        users.add(new User("name0", "lastname0", "city0", 0));

        List<Order> orders = new ArrayList<>();
        orders.add(new Order(BigDecimal.valueOf(1),Currency.EUR,"name1","shopid1", users.get(1)));
        orders.add(new Order(BigDecimal.valueOf(1),Currency.EUR,"name2","shopid1", users.get(2)));
        orders.add(new Order(BigDecimal.valueOf(2),Currency.EUR,"name3","shopid1", users.get(3)));
        orders.add(new Order(BigDecimal.valueOf(2),Currency.EUR,"name4","shopid1", users.get(4)));
        orders.add(new Order(BigDecimal.valueOf(3),Currency.EUR,"name6","shopid1", users.get(5)));
        orders.add(new Order(BigDecimal.valueOf(3),Currency.EUR,"name5","shopid1", users.get(6)));
        orders.add(new Order(BigDecimal.valueOf(7),Currency.EUR,"name7","shopid1", users.get(7)));
        orders.add(new Order(BigDecimal.valueOf(8),Currency.EUR,"name8","shopid1", users.get(8)));
        orders.add(new Order(BigDecimal.valueOf(9),Currency.EUR,"name9","shopid1", users.get(9)));
        orders.add(new Order(BigDecimal.valueOf(0),Currency.EUR,"name0","shopid1", users.get(0)));

        orders.sort(Order::compareTo);
        System.out.println(orders);

        orders.sort(new OrderComparator());

        System.out.println(orders);

        orders.sort(new OrderComparatorTwo());

        System.out.println(orders);
    }
}
