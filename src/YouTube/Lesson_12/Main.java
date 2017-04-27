package YouTube.Lesson_12;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

/**
 * Created by qurub on 27.04.2017.
 */
public class Main {
    //static Formatter formatter;
    public static void main(String[] args) {
        try (Formatter formatter = new Formatter("res//12.txt")) {
            Scanner scn = new Scanner(System.in);
            System.out.println("Сколько вам лет?");
            int a = Integer.parseInt(scn.next());
            System.out.println("Как вас зовут?");
            String b = scn.next();
            System.out.println("Где вы живете?");
            String c = scn.next();
            formatter.format("Меня зовут %s, мне %d лет, я живу в городе %s", b, a, c);
            formatter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
