package Homework7;

import java.math.BigDecimal;
import java.util.*;

public class Main2 {
    private static Set<Order> orderSet = new TreeSet<>(  );

    public static Order findBySurname(String surname) {
        Iterator<Order> iterator = orderSet.iterator();
        while(iterator.hasNext()) {
            Order order = iterator.next();
            if(order.getUser().getLastName() == surname)
                return order;
        }
        return null;
    }

    public static void remove(Currency currency) {
        Iterator<Order> iterator = orderSet.iterator();
        while(iterator.hasNext()) {
            Order order = iterator.next();
            if(order.getCurrency() == currency)
                orderSet.remove( order );
        }
    }


    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("name1", "lastname1", "city1", 1));
        users.add(new User("name2", "Petrov", "city2", 2));
        users.add(new User("name3", "lastname3", "city3", 3));
        users.add(new User("name4", "lastname4", "city4", 4));
        users.add(new User("name5", "lastname5", "city5", 5));
        users.add(new User("name6", "lastname6", "city6", 6));
        users.add(new User("name7", "lastname7", "city7", 7));
        users.add(new User("name8", "lastname8", "city8", 8));
        users.add(new User("name9", "lastname9", "city9", 9));
        users.add(new User("name0", "lastname0", "city0", 0));

        orderSet.add(new Order(BigDecimal.valueOf(1),Currency.EUR,"name1","shopid1", users.get(1)));
        orderSet.add(new Order(BigDecimal.valueOf(1),Currency.EUR,"name2","shopid1", users.get(2)));
        orderSet.add(new Order(BigDecimal.valueOf(2),Currency.EUR,"name3","shopid1", users.get(3)));
        orderSet.add(new Order(BigDecimal.valueOf(2),Currency.EUR,"name4","shopid1", users.get(4)));
        orderSet.add(new Order(BigDecimal.valueOf(3),Currency.EUR,"name6","shopid1", users.get(5)));
        orderSet.add(new Order(BigDecimal.valueOf(3),Currency.EUR,"name5","shopid1", users.get(6)));
        orderSet.add(new Order(BigDecimal.valueOf(7),Currency.EUR,"name7","shopid1", users.get(7)));
        orderSet.add(new Order(BigDecimal.valueOf(8),Currency.EUR,"name8","shopid1", users.get(8)));
        orderSet.add(new Order(BigDecimal.valueOf(0),Currency.EUR,"name0","shopid0", users.get(0)));
        orderSet.add(new Order(BigDecimal.valueOf(0),Currency.EUR,"name0","shopid0", users.get(0)));

        System.out.println(findBySurname("Petrov"));
        remove(Currency.USD);

    }
}
