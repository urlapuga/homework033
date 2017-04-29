package hOMEWORK11;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Created by Андрей on 28.04.2017.
 */


public class Main {

    private static  String path = new File("").getAbsolutePath();
    private static File file = new File(path + "/file1.txt");
    private static List<String> list = new ArrayList<>();


    //  Создать метод, который заменяет слова в файле (File) и возвращает строку (String) с заменёнными значениями.
    String replacer1(Map map) {
        List<String> task1 = list.stream().filter(u -> !u.equals("asd")).collect(Collectors.toList());
        return String.join(", ", task1);
    }

    boolean fileWriter(List<String> list) throws IOException {
        BufferedWriter output = new BufferedWriter(new FileWriter(file));

        for (String s : list) {
            output.write(s);
        }
        output.close();
        return false;
    }


    public static void main(String[] args) throws FileNotFoundException {



        Scanner scan = new Scanner(file);
        while (scan.hasNext()) {
            list.add(scan.next());
        }



        list.removeIf(p -> p.equals("asd"));
        list.forEach(System.out::println);


        System.out.println("part");

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                scanner.nextLine().replace("asd", "was");
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {

            // List<String> =  bufferedReader.lines().filter(i->i="1").collect(Collectors.toList());

            bufferedReader.lines().forEach(System.out::println);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
