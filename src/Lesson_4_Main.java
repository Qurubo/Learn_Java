import javax.swing.*;

/**
 * Created by qurub on 22.02.2016.
 */
public class Lesson_4_Main {
    public static void main(String[] args) {
        Lesson_4_Reader r = new Lesson_4_Reader("Окошко");
        r.setVisible(true);
        r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        r.setSize(300,200);
        r.setResizable(false);
        r.setLocationRelativeTo(null);
      /*  Lesson_4_Reader r =new Lesson_4_Reader();
        r.Scan();
        r.i=count(r.i);
        r.k=count(r.k);
        r.Scan(r.i,r.k);*/


    }
   /* private static int count(int x){
        x++;
        return x;
    }*/
}
