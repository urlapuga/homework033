package Homework8;

import java.util.*;

/**
 * Created by Андрей on 30.03.2017.
 */
public class IManageSystemImpl implements IManageSystem {

    private Map<Food, Double> database;
    @Override
    public Object save(Object obj, double price) {
        database.put((Food)obj,price);
        return database;
    }

    @Override
    public Object save(Object obj) {
        return database;
    }

    @Override
    public void delete(Object obj) {
        database.remove(obj);
    }

    @Override
    public void deleteById(int id) {
        database.remove(id);
    }

    @Override
    public Object get(int id) {
        return database.get(id);
    }

    @Override
    public Double getPrice(Object obj) {
        return database.get(obj);
    }

    @Override
    public Set getProducts() {
        return null;
    }

    @Override
    public List<Double> getPrices() {
        return null;
    }
}
