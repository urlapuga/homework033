package Homework7;

import java.util.Comparator;


public class OrderComparatorTwo implements Comparator<Order> {
    @Override
    public int compare(Order o1, Order o2) {
        int res = o1.getItemName().compareTo(o2.getItemName());
        if (res != 0) {
            return res;
        }//
        res = o1.getShopIdentificator().compareTo(o2.getShopIdentificator());
        if (res != 0) {
            return res;
        }//
        return o1.getCity().compareTo(o2.getCity());
    }
}
