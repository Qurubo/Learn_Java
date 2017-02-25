package Book.Chapter_6.lambda;

import javax.swing.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

/**
 * Created by Kirill on 25.02.2017.
 */
public class LambdaTest {
    public static void main(String[] args) {
        String[] planets = new String[]{"Mercury","Venus","Earth",
            "Mars","Jupiter","Saturn","Uranus","Neptune"};
        System.out.println(Arrays.toString(planets));
        System.out.println("Sorted in dictionary order:");
        Arrays.sort(planets);
        System.out.println(Arrays.toString(planets));
        System.out.println("Sorted by length:");
//      OLD
//      Arrays.sort(planets,new LengthComparator());
        Arrays.sort(planets,(first,second) ->first.length()-second.length());
        System.out.println(Arrays.toString(planets));

        Timer timer = new Timer(3000,e -> {
            System.out.println("The time is "+ new Date());
        });
        timer.start();
        JOptionPane.showMessageDialog(null,"Quit program?");
        System.exit(0);


    }
}
// OLD
// class LengthComparator implements Comparator<String>{
//    @Override
//    public int compare(String first, String second) {
//        return first.length()-second.length();
//    }
//}
