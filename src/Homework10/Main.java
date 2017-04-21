package Homework10;

/**
 * Created by Андрей on 21.04.2017.
 */
class Test extends  Exception{};
public class Main {
    public static void main(String[] args) {
        String a = "string";
        try{
            String e = "string";
            throw new Exception(e);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());;
        } finally {
            System.out.println("inside finally");
        }
        }
    }

