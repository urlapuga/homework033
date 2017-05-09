package Homework8;

/**
 * Created by Андрей on 30.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        IManageSystem system = new IManageSystemImpl();
        Food testFood = new Food("testFood",Country.ENGLAND,0);
        system.save(testFood,0);
        system.save(new Food("food2",Country.GERMANY,4),Long.valueOf(12));
        system.save(new Food("food3",Country.POLAND,5),Long.valueOf(13));
        system.save(new Food("food4",Country.POLAND,5),Long.valueOf(14));
        system.save(new Food("food5",Country.RUSSIA,5),Long.valueOf(15));
        system.save(new Food("zerocost",Country.ENGLAND,0));

        System.out.println(system.get(1));
        System.out.println(system.getPrice(testFood));
        System.out.println(system.getPrices());

        System.out.println(system.getProducts());
        system.delete(testFood);
        system.deleteById(2);
        System.out.println(system.getProducts());
    }
}
