package YouTube.Lesson_7;

import javax.swing.*;
import java.awt.*;

/**
 * Created by qurub on 25.04.2017.
 */
public class Frame extends JFrame{

    JButton btnOk,btnCancel;
    JLabel l1,l2,l3,l4;
    JTextField t1,t2;
    int i,k;
    String a,b;
    public Frame(String title) throws HeadlessException {
        super(title);
        setLayout(new FlowLayout());

        btnOk = new JButton("Подсчитать");
        btnCancel = new JButton("Очистить");

        l1 = new JLabel("Введите первое число");
        l2 = new JLabel("Введите второе число");
        l3 = new JLabel("");
        l4 = new JLabel("");
        t1 = new JTextField(10);
        t2 = new JTextField(10);

        add(btnOk);
        add(btnCancel);
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(l4);
    }
}
