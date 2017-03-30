package Homework7;

import java.math.BigDecimal;

/**
 * Created by Андрей on 23.03.2017.
 */
class Order implements Comparable<Order> {
    private long id;
    private BigDecimal price;
    private Currency currency;
    private String itemName;
    private String shopIdentificator;
    private User user;

    public Order(BigDecimal price, Currency currency, String itemName, String shopIdentificator, User user) {
        this.id = 1;
        this.price = price;
        this.currency = currency;
        this.itemName = itemName;
        this.shopIdentificator = shopIdentificator;
        this.user = user;
    }

    @Override
    public int compareTo(Order o) {
        return -price.compareTo(o.price);
    }
    @Override
    public String toString()
    {
        return this.price.toString() + " " + this.itemName;
    }

}