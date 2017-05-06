package Homework7;

import java.util.*;

public class Task4 {
    private static long start = 0;
    static long timeDiff() {
        long timediff = System.nanoTime() - start;
        start = System.nanoTime();
        return timediff;
    }

    public static void main(String[] args) {


        List<Integer> intArrayList = new ArrayList<>();
        List<String> stringArrayList = new ArrayList<>();

        List<Integer> intLinkedList = new LinkedList<>();
        List<String> stringLinkedList = new LinkedList<>();


        int num = 1000;


        start = System.nanoTime();
        //ADD

        //ArrayList
        for (int i = 0; i < num; i++) {
            intArrayList.add( i );
        }
        System.out.println( "Time to add " + num + " integers to ArrayList - " + timeDiff() ) ;

        for (int i = 0; i < num; i++) {
            stringArrayList.add( Integer.toString( i ) );
        }
        System.out.println( "Time to add " + num + " strings - to ArrayList" + timeDiff()  );

        //LinkedList
        for (int i = 0; i < num; i++) {
            intLinkedList.add( i );
        }
        System.out.println( "Time to add " + num + " integers to LinkedList - " + timeDiff() ) ;

        for (int i = 0; i < num; i++) {
            stringLinkedList.add( Integer.toString( i ) );
        }
        System.out.println( "Time to add " + num + " strings to LinkedList - " + timeDiff()  );


        //SET

        for (int i = 0; i < num; i++) {
            intArrayList.set( i, i );
        }
        System.out.println( "Time to set 1000 integers - " + timeDiff()   );

        for (int i = 0; i < num; i++) {
            stringArrayList.set( i, Integer.toString( i ) );
        }
        System.out.println( "Time to set 1000 strings - " + timeDiff()  );


        //GET

        for (int i = 0; i < num; i++) {
            intArrayList.get( i );
        }
        System.out.println( "Time to get " + num + " integers - " + timeDiff() );

        for (int i = 0; i < num; i++) {
            stringArrayList.get( i );
        }
        System.out.println( "Time to get" + num + "strings - " + timeDiff() );


        //Remove
        Iterator<Integer> iterator = intArrayList.iterator();
        while(iterator.hasNext()) {
            iterator.remove();
        }
        System.out.println( "Time to remove" + num + "integers - " + timeDiff()  );


        Iterator<String> iterator2 = stringArrayList.iterator();
        while(iterator2.hasNext()) {
             iterator2.remove();
        }
        System.out.println( "Time to remove" + num + "strings - "+ timeDiff()  );
    }
}
