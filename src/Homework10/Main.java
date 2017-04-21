package Homework10;

/**
 * Created by Андрей on 21.04.2017.
 */
class Test extends Exception {
};

public class Main {
    public static void main(String[] args) throws ExceptionTwo {



        //TASK1
        String a = "string";
        try {
            String e = "string";
            throw new Exception(e);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            ;
        } finally {
            System.out.println("inside finally");
        }
        //TASK 2
        try {
            throw new ExceptionsClass("message");
        } catch (ExceptionsClass exceptionsClass) {
            exceptionsClass.write();
        }
        //TASK3

        Integer int1 = null;
        Integer int2 = 1;

        try {
            Integer result = int1*int2;
        }
        catch (NullPointerException nullex)
        {
            System.out.println("null pointer exception");
        }
        finally {
            System.out.println("int1="+int1+" int2="+int2);
        }
//TASK4
        Testfg.f();
    }
}

