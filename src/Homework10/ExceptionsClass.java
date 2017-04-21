package Homework10;

/**
 * Created by Андрей on 21.04.2017.
 */
public class ExceptionsClass extends Exception {
    public ExceptionsClass(String message) {
        super(message);
    }
    public void write(){
        System.out.println(super.getMessage());
    }
}
