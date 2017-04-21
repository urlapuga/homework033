package Homework105;

/**
 * Created by Андрей on 21.04.2017.
 */
public class ExceptionGenerator {
    private int i;

    public  ExceptionGenerator(int i) throws Exception1,Exception2,Exception3{
        this.i = i;
        if(i==1) throw new Exception1();
        if(i==2) throw new Exception2();
        if(i==3) throw new Exception3();

    }
}
