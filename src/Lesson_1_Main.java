/**
 * Created by qurub on 22.02.2016.
 */
public class Lesson_1_Main {
    public static void main(String[] args) {
        Lesson_1_Reader r =new Lesson_1_Reader();
        r.Scan();
        r.i=count(r.i);
        r.k=count(r.k);
        System.out.println("i="+r.i);
        System.out.println("k="+r.k);

    }
    private static int count(int x){
        x++;
        return x;
    }
}
