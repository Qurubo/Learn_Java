/**
 * Created by qurub on 22.02.2016.
 */
public class Main {
    public static void main(String[] args) {
        Reader r =new Reader();
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
