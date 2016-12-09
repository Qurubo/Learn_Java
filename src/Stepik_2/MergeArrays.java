package Stepik_2;

import java.util.Arrays;

/**
 * Created by qurub on 09.12.2016.
 */
public class MergeArrays {
    public static void main(String[] args) {
        assertEquals(mergeArrays(new int[]{0, 2, 4}, new int[]{1, 3, 5}), new int[]{0, 1, 2, 3, 4, 5}, "Test #1");
        assertEquals(mergeArrays(new int[]{}, new int[]{1, 3, 5}), new int[]{1, 3, 5}, "Test #2");
        assertEquals(mergeArrays(new int[]{}, new int[]{}), new int[]{}, "Test #3");
        assertEquals(mergeArrays(new int[]{1, 1, 1}, new int[]{1, 1, 1}), new int[]{1, 1, 1, 1, 1, 1}, "Test #4");
        assertEquals(mergeArrays(new int[]{1, 2, 3}, new int[]{1, 2, 3}), new int[]{1, 1, 2, 2, 3, 3}, "Test #5");
        assertEquals(mergeArrays(new int[]{6}, new int[]{1, 3, 5}), new int[]{1, 3, 5, 6}, "Test #6");
        assertEquals(mergeArrays(new int[]{6}, new int[]{5, 5, 5, 5}), new int[]{5, 5, 5, 5, 6}, "Test #7");
        assertEquals(mergeArrays(new int[]{1, 2, 3, 5}, new int[]{6}), new int[]{1, 2, 3, 5, 6}, "Test #8");
        assertEquals(mergeArrays(new int[]{}, new int[]{}), new int[]{}, "Test #9");
        assertEquals(mergeArrays(new int[]{-3, -2, -1 , 0}, new int[]{-1, 1, 1}), new int[]{-3, -2, -1, -1, 0, 1, 1}, "Test #10");
        assertEquals(mergeArrays(new int[]{1, 2, 3}, new int[]{4, 4}), new int[]{1, 2, 3, 4, 4}, "Test #11");
    }
    public static int[] mergeArrays(int[] a1, int[] a2) {
        int[] z=new int[a1.length+a2.length];
//        for (int e = 0; e < a1.length; e++) {
//            if (a1[e] < 0) {
//                z[0+e]=a1[e];
//            }else {
//                z[z.length-1] = a1[e];
//            }
//            Arrays.sort(z);
////            for (int i = 0; i < z.length-1; i++) {
////                for (int j = 0; j < z.length-1; j++) {
////                    if (z[j]>z[j+1]) {
////                        int buf=z[j];
////                        z[j]=z[j+1];
////                        z[j+1]=buf;
////                    }
////                }
////            }
//        }
//        for (int e = 0; e < a2.length; e++) {
//            if (a2[e] < 0) {
//                z[0+e]=a2[e];
//            }else {
//                z[z.length-1] = a2[e];
//            }
//            Arrays.sort(z);
////            for (int i = 0; i < z.length-1; i++) {
////                for (int j = 0; j < z.length-1; j++) {
////                    if (z[j]>z[j+1]) {
////                        int buf=z[j];
////                        z[j]=z[j+1];
////                        z[j+1]=buf;
////                    }
////                }
////            }
//        }
        System.arraycopy(a1, 0, z, 0, a1.length);
        System.arraycopy(a2, 0, z, a1.length, a2.length);
        Arrays.sort(z);
        return z; // your implementation here
    }
    public static void assertEquals(int[] value, int[] expected, String msg) {

        if (!Arrays.equals(value, expected))
            System.out.printf("%s: Error! Expected %s, got %s.\n", msg, Arrays.toString(expected), Arrays.toString(value));
        else
            System.out.printf("%s: Ok\n", msg);
    }

}
