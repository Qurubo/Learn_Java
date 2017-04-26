package YouTube.Lesson_11;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by qurub on 27.04.2017.
 */
public class Main {
    static Scanner scanner;

    static String[][] array = new String[5][3];

    public static void main(String[] args) {
        openFile();
        readFile();
        out();
    }

    private static void out() {

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array[i][j] + "  ");
            }
            System.out.println();
        }

    }

    private static void readFile() {
        while (scanner.hasNext()) {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    array[i][j] = scanner.next();
                }
            }
        }
    }

    private static void openFile() {
        try {
            scanner = new Scanner(new File("res//1.txt"));
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Файл не найден");
        }
    }

}
