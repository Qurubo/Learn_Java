package YouTube.Lesson_6;

import javax.swing.*;

/**
 * Created by qurub on 23.04.2017.
 */
public class Reader {
    int i,k;
    String n1,n2;

    public void Scan() {
        n1 = JOptionPane.showInputDialog(null,"Введите первое число.");
        i = Integer.parseInt(n1);
        n2 = JOptionPane.showInputDialog(null, "Введите второе число.");
        k = Integer.parseInt(n2);
    }

    public void Scan(int a, int b) {
        JOptionPane.showMessageDialog(null, "Теперь ваше первое число равняется = "+(a+1)+
                "\n Теперь ваше первое число равняется = "+(b+1));
    }
}
