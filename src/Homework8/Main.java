package Homework8;

import java.util.*;

import static Homework8.Country.*;

/**
 * Created by Андрей on 30.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        IManageSystemImpl system = new IManageSystemImpl();
        system.save(new Food("food1",Country.ENGLAND,3),1);
        system.save(new Food("food2",Country.GERMANY,4),2);
        system.save(new Food("food3",Country.POLAND,5),3);
    }
}
