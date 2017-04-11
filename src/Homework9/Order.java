package Homework9;

class Order  {
    private long id;
    private int price;
    private Currencies currency;
    private String itemName;
    private String shopIdentificator;
    private User user;

    public long getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public Currencies getCurrency() {
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

    public Cities getCity() {
        return user.getCity();
    }

    public Order(int price, Currencies currency, String itemName, String shopIdentificator, User user) {
        this.id = 1;
        this.price = price;
        this.currency = currency;
        this.itemName = itemName;
        this.shopIdentificator = shopIdentificator;
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order)) return false;

        Order order = (Order) o;

        return (id != order.id) ? false : (price != order.price) ? false : (!currency.equals(order.currency)) ? false : (!itemName.equals(order.itemName)) ? false : (!shopIdentificator.equals(order.shopIdentificator)) ? false : (!user.equals(order.user)) ? false : true;
    }

    @Override
    public String toString() {
        return "price - " + this.price + " City - " + this.getCity() + " " + this.getId() + " " + this.getCurrency();
    }

}