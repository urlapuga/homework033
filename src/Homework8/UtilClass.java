package Homework8;

/**
 * Created by Андрей on 30.03.2017.
 */
public final class UtilClass {
    public static int generateId(Country country,String name){
        return country.toString().length()*country.toString().hashCode();
    }
}
