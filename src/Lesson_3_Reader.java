import javax.swing.*;
import java.util.Scanner;

/**
 * Created by qurub on 22.02.2016.
 */
public class Lesson_3_Reader {
    int k,i;
    String n1,n2;
    public void Scan(){
        n1= JOptionPane.showInputDialog("Введите первое число");
        n2= JOptionPane.showInputDialog("Введите второе число");
        i=Integer.parseInt(n1);
        k=Integer.parseInt(n2);

    }
    public void Scan(int a,int b){
       JOptionPane.showMessageDialog(null,"Теперь первое число равняется = "+a);
       JOptionPane.showMessageDialog(null,"Теперь второе число равняется = "+b);

    }
}
