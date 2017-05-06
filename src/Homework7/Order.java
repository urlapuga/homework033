package Homework7;

import java.math.BigDecimal;


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

    public BigDecimal getPrice() {
        return price;
    }

    public Currency getCurrency() {
        return currency;
    }

    public String getItemName() {
        return itemName;
    }

    public String getShopIdentificator() {
        return shopIdentificator;
    }

    public User getUser() {
        return user;
    }

    public String getCity() {
        return user.getCity();
    }

    @Override
    public int compareTo(Order o) {
        return -price.compareTo(o.price);
    }

    @Override
    public String toString() {
        return this.price.toString() + " " + this.getCity() + " " + this.getShopIdentificator();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order)) return false;
        Order order = (Order) o;
        if (id != order.id) return false;
        if (price != order.price) return false;
        if (!currency.equals(order.currency)) return false;
        if (!itemName.equals(order.itemName)) return false;
        if (!shopIdentificator.equals(order.shopIdentificator)) return false;
        return user.equals(order.user);
    }

    @Override
    public int hashCode() {

        int result = (int) (31 + id);
        result = 31 * result + price.hashCode();
        result = 31 * result + currency.hashCode();
        result = 31 * result + itemName.hashCode();
        result = 31 * result + shopIdentificator.hashCode();
        result = 31 * result + user.hashCode();
        return result;
    }
}