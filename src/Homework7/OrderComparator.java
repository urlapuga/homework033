package Homework7;

import java.util.Comparator;


public class OrderComparator implements Comparator<Order> {
    @Override
    public int compare(Order o1, Order o2) {
        int res = o1.getPrice().compareTo(o2.getPrice());
        if (res != 0) {
            return res;
        }//?
        return o1.getCity().compareTo(o2.getCity());
    }
}
