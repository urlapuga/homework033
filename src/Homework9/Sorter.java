package Homework9;

import java.util.Collections;
import java.util.List;

/**
 * Created by Андрей on 11.04.2017.
 */
public class Sorter {
    private Sorter(){}

    public static void byPrice(List<Order> orders){
        Collections.sort(orders, (Order o1, Order o2) -> Integer.compare(o2.getPrice(), o1.getPrice()));
        //orders.stream().sorted((o1, o2) -> Integer.compare(o2.getPrice(), o1.getPrice())).forEach(o-> System.out.println(o));
    }
}
