import java.util.Scanner;

/**
 * Created by qurub on 22.02.2016.
 */
public class Reader {
    int k;
    int i;
    public void Scan(){
        System.out.println("Введите первое число");
        Scanner s =new Scanner(System.in);
        i=s.nextInt();
        System.out.println("Введите второе число");
        k=s.nextInt();

    }
}
