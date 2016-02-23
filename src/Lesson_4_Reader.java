import javax.swing.*;
import java.awt.*;

/**
 * Created by qurub on 22.02.2016.
 */
public class Lesson_4_Reader extends JFrame{
    JButton b1,b2;
    JLabel l1,l2,l3,l4;
    JTextField t1,t2;
    int i,k;
    String a,b;
    public Lesson_4_Reader(String s){
        super(s);
        setLayout(new FlowLayout());
        b1 = new JButton("Очистить");
        b2 = new JButton("Посчитать");
        l1 = new JLabel("Введите первое число:");
        l2 = new JLabel("Введите второе число:");
        l3 = new JLabel("");
        l4 = new JLabel("");
        t1 = new JTextField(10);
        t2 = new JTextField(10);

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(l4);
        add(b1);
        add(b2);
    }
   /* int k,i;
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

    }*/
}
