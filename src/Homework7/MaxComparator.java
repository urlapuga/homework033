package Homework7;

import java.util.Comparator;

/**
 * Created by Андрей on 30.03.2017.
 */
public class MaxComparator implements Comparator<Order> {
    @Override
    public int compare(Order o1, Order o2) {
        return o1.getPrice().compareTo(o2.getPrice());
    }
}