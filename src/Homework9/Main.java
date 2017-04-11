package Homework9;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by Андрей on 06.04.2017.
 */
public class Main {
    public static void main(String[] args) {

        List<User> userList = new ArrayList<>();
        List<Order> orderList = new ArrayList<>();

        // В Main создайте 10 заказов с 10 пользователями и добавьте его в List.
        // public User(String firstName, String lastName, String city, int balance)

        userList.add(new User("firstname1", "Petrov", Cities.KHARKOV, 100));
        userList.add(new User("firstname2", "lastname2", Cities.KIEV, 200));
        userList.add(new User("firstname3", "lastname", Cities.MOSKOW, 300));
        userList.add(new User("firstname4", "lastname4", Cities.MOSKOW, 400));
        userList.add(new User("firstname5", "lastname5", Cities.MOSKOW, 500));
        userList.add(new User("firstname6", "lastname6", Cities.KIEV, 600));
        userList.add(new User("firstname7", "lastname7", Cities.MOSKOW, 700));
        userList.add(new User("firstname8", "lastname8", Cities.KHARKOV, 800));
        userList.add(new User("firstname9", "lastname9", Cities.KHARKOV, 900));
        userList.add(new User("firstname0", "lastname0", Cities.KHARKOV, 1000));


        //public Order(double price, Currencies currency, String itemName, String shopIdentificator, User user) {

        orderList.add(new Order(1, Currencies.EUR, "name1", "id1", userList.get(0)));
        orderList.add(new Order(2, Currencies.USD, "name2", "id2", userList.get(1)));
        orderList.add(new Order(3, Currencies.EUR, "name3", "id3", userList.get(2)));
        orderList.add(new Order(4, Currencies.UAH, "name4", "id4", userList.get(3)));
        orderList.add(new Order(5, Currencies.EUR, "name5", "id5", userList.get(4)));
        orderList.add(new Order(6, Currencies.EUR, "name6", "id6", userList.get(5)));
        orderList.add(new Order(7, Currencies.EUR, "name7", "id7", userList.get(6)));
        orderList.add(new Order(8, Currencies.EUR, "name8", "id8", userList.get(7)));
        orderList.add(new Order(9, Currencies.EUR, "name9", "id9", userList.get(8)));
        orderList.add(new Order(10, Currencies.EUR, "name10", "id0", userList.get(9)));


        //отсортируйте список за ценой заказа по убыванию
        System.out.println("\nSorted by price desc");
        Sorter.byPrice(orderList);
        orderList.stream().forEach(o -> System.out.println(o));


        // -отсортируйте список за ценой заказа по возрастанию и за городом пользователя
        System.out.println("\nSorted by price desc, then city asc");
        Comparator<Order> byCity = (o1, o2) -> (o1.getUser().getCity()).compareTo(o2.getUser().getCity());
        Comparator<Order> byPrice = (o1, o2) -> Integer.compare(o2.getPrice(), o1.getPrice());
        orderList.stream().sorted(byPrice.thenComparing(byCity)).forEach(order -> System.out.println(order));


        //отсортируйте список за наименованием товара, идентификатором заказа, и городом пользователя
        System.out.println("\nSorting by item name, ID, then city:");
        Comparator<Order> byId = (o1, o2) -> Long.compare((o1.getId()), (o2.getId()));
        Comparator<Order> byItemName = (o1, o2) -> (o1.getItemName()).compareTo(o2.getItemName());

        orderList.stream().sorted(byItemName.thenComparing(byId).thenComparing(byCity)).forEach(o -> System.out.println(o));


        //удалите дублированные данные со списка

        List<Order> tempOrderList = new ArrayList<>();
        tempOrderList.addAll(orderList);
        List<Order> noDuplicates = tempOrderList.stream().distinct().collect(Collectors.toList());
        System.out.println("\nThis is the list cleaned from duplicates:");
        noDuplicates.forEach(order -> System.out.println(order));


        //удалите объекты, где цена меньше 1500

        noDuplicates.removeIf(order -> order.getPrice() < 1500);
        noDuplicates.forEach(order -> System.out.println(order));

        //разделите список на 2 списка - заказы в долларах и в гривнах

        List<Order> ordersUAH = orderList.stream().filter(o -> o.getCurrency() == Currencies.UAH).collect(Collectors.toList());
        System.out.println("\nUAH Orders");
        ordersUAH.stream().forEach(o -> System.out.println(o));
        List<Order> ordersUSD = orderList.stream().filter(o -> o.getCurrency() == Currencies.USD).collect(Collectors.toList());
        System.out.println("\nUSD Orders");
        ordersUSD.stream().forEach(o -> System.out.println(o));


        //разделите список на столько списков, сколько уникальных городов в User

        Map<String, List<Order>> byUserCity = orderList.stream().collect(Collectors.groupingBy(order -> order.getUser().getCity().toString()));
        byUserCity.forEach((city, order) -> System.out.println(city + ": " + order));


        //проверьте, содержит ли сет заказ, где фамилия пользователя - “Petrov”

        if (orderList.stream().anyMatch(order -> order.getUser().getLastName().equalsIgnoreCase("Petrov"))) {
            System.out.println("\nOrdered by Petrov:");
            orderList.stream().filter(order -> order.getUser().getLastName().equalsIgnoreCase("Petrov")).forEach(order -> System.out.println(order));
        } else System.out.println("\nNo Orders from Petrov");

        //удалите заказы в USD

        orderList.removeIf(o -> o.getCurrency() == Currencies.USD);
    }
}
