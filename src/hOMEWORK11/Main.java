package hOMEWORK11;

import java.io.*;

/**
 * Created by Андрей on 28.04.2017.
 */



public class Main {
    public static void main(String[] args) {


        File file = new File("c://text.txt");

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
           // bufferedReader.lines().forEach(System.out::println);
            //bufferedReader.lines().filter().collect(Collectors.toList());
          bufferedReader.lines().forEach(System.out::println);
         //   System.out.println(stringLess);
         //   bufferedReader.lines().forEach(System.out::println);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
