package Homework8;

import java.util.*;

/**
 * Created by Андрей on 30.03.2017.
 */
public class IManageSystemImpl implements IManageSystem<Food> {

    private Map<Food, Double> database;


    @Override
    public Food save(Food obj, double price) {
        database.put(obj,price);
        return obj;
    }

    @Override
    public Food save(Food obj) {
        database.put(obj,Double.valueOf(0));
        return obj;
    }

    @Override
    public void delete(Food obj) {
        database.remove(obj);
    }

    @Override
    public void deleteById(int id) {
        database.forEach((k,v)->{
            if(k.getId()==id)database.remove(k);
        }
        );
    }

    @Override
    public Food get(int id) {
        Set<Food> foods = database.keySet();
        return (Food) foods.stream().filter(f->f.getId()==id);
    }

    @Override
    public Double getPrice(Food obj) {
        return database.get(obj);
    }

    @Override
    public Set<Food> getProducts() {
        return database.keySet();
    }

    @Override
    public List<Double> getPrices() {
        return (List<Double>) database.values();
    }
}
