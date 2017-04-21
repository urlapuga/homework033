package Homework105;

/**
 * Created by Андрей on 21.04.2017.
 */
public class Main {
    public static void main(String[] args) throws Exception3, Exception2, Exception1 {
        try{
            ExceptionGenerator eg = new ExceptionGenerator(1);
        }
        catch (Exception1 |Exception2|Exception3 e) {
            System.out.println("123");
        }
    }
}
