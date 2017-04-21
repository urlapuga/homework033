package Homework10;

/**
 * Created by Андрей on 21.04.2017.
 */
public class Testfg {
    public static void f() throws ExceptionTwo {
        try {
            g();
        } catch (ExceptionsClass e) {
            throw new ExceptionTwo();
        }
    }

    public static void g() throws ExceptionsClass {

            throw new ExceptionsClass("message");


    }

}
