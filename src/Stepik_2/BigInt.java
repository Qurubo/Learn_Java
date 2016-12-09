package Stepik_2;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by qurub on 09.12.2016.
 */
public class BigInt {
    public static void main(String[] args) {
        int v;
        Scanner scanner =new Scanner(System.in);
        v=scanner.nextInt();
        BigInteger a=factorial(v);
        System.out.println(a.toString());
    }
    public static BigInteger factorial(int value) {
        BigInteger a= BigInteger.valueOf(1);
        for (int i = 1; i <=value; i++) {
           a=a.multiply(BigInteger.valueOf(i));
        }
        return a; // your implementation here
    }
}
