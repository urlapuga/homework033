package Homework8;

/**
 * Created by Андрей on 30.03.2017.
 */
public final class UtilClass {
    static int i = 0;
    public static int generateId(Country country,String name){
        i++;
        return country.toString().length()*country.toString().hashCode()+i;
    }
}
