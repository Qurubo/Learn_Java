package YouTube.Lesson_8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by qurub on 25.04.2017.
 */
public class Frame extends JFrame {

    JButton btnOk, btnCancel;
    JLabel l1, l2, l3, l4;
    JTextField t1, t2;
    int i, k;
    String a, b;

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

        eHandler handler = new eHandler();
        btnOk.addActionListener(handler);
        btnCancel.addActionListener(e -> {
            if(e.getSource()==btnCancel){
                t1.setText("");
                t2.setText("");
                l3.setText("");
                l4.setText("");
            }
        });
        // btnOk.setAction();
    }

    public class eHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                if (e.getSource() == btnOk) {
                    i = Integer.parseInt(t1.getText());
                    k = Integer.parseInt(t2.getText());
                    i++;
                    k++;
                    a="Ваше первое число теперь равно " + i;
                    b="Ваше второе число теперь равно " + k;
                    l3.setText(a);
                    l4.setText(b);
                }
//                if(e.getSource() == btnCancel) {
//                    t1.setText("");
//                    t2.setText("");
//                    l3.setText("");
//                    l4.setText("");
//                }
            } catch (NumberFormatException e1) {
                JOptionPane.showMessageDialog(null,"Введите в поле число");
            }
        }
    }
}
