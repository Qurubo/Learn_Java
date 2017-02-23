package Book.Chapter_5.enumTest;

import java.util.Scanner;

/**
 * Created by Kirill on 24.02.2017.
 */
public class Enums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a size:(SMALL, MEDIUM, LARGE, EXTRA_LARGE)");
        String input = in.next().toUpperCase();
        Size size = Enum.valueOf(Size.class,input);
        System.out.println("size= "+size);
        System.out.println("abbreviation= "+size.getAbbreviation());
        if (size==Size.EXTRA_LARGE) {
            System.out.println("Good job--you paid attention to the _.");
        }
        Size[] values = Size.values();
        for (Size value : values) {
            System.out.println(value.toString()+" "+value.getAbbreviation());
        }
    }
}
