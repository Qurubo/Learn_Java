package Book.Chapter_8.Classes;

/**
 * Created by qurub on 29.05.2017.
 */
public class ArrayAlg {
    public static Pair<String> minmax(String[] a) {
        if (a == null || a.length == 0) {
            return null;
        }
        String min = a[0];
        String max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (min.compareTo(a[i])>0) min=a[i];
            if (max.compareTo(a[i])<0) max=a[i];

        }
        return new Pair<>(min, max);
    }
    public static  Pair<Integer> minmax(int[] a){
        if (a == null || a.length == 0) {
            return null;
        }
        int min = a[0];
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if(a[i]>max) max = a[i];
            if(a[i]<min) min = a[i];

        }
        return new Pair<>(min, max);
    }
}
