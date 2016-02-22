/**
 * Created by qurub on 22.02.2016.
 */
public class Lesson_3_Main {
    public static void main(String[] args) {
        Lesson_3_Reader r =new Lesson_3_Reader();
        r.Scan();
        r.i=count(r.i);
        r.k=count(r.k);
        r.Scan(r.i,r.k);


    }
    private static int count(int x){
        x++;
        return x;
    }
}
