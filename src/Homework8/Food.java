package Homework8;

/**
 * Создайте класс Food со следующими полями:
 * id (уникальный идентификатор товара)
 * name (наименование товара)
 * country (страна производитель)
 * expiration (срок годности в днях)
 * Реализуйте доступ к полям. Идентификатор id должен быть недоступен для изменения и генерироваться с помощью IdGenerator при создании товара.
 * Товары считаются одинаковыми, если их id одинаковы. Переопределите методы hashCode и equals соответственно.
 */
public class Food {
    private int id;
    private String name;
    private Country country;
    private int expiration;

    public Food(String name, Country country, int expiration) {
        this.id = UtilClass.generateId(country, name);
        this.name = name;
        this.country = country;
        this.expiration = expiration;
    }

    @Override
    public boolean equals(Object o) {

        if (o == this) return true;
        if (!(o instanceof Food)) {
            return false;
        }

        Food food = (Food) o;
        return this.id == food.id;
    }

    @Override
    public int hashCode() {
        return 31 + id * 31;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public int getExpiration() {
        return expiration;
    }

    public void setExpiration(int expiration) {
        this.expiration = expiration;
    }
}
