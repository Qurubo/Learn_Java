package Chapter12;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by qurub on 26.09.2016.
 */
public class SimpleGui1 implements ActionListener {
    JButton btn;
    public static void main(String[] args) {
        SimpleGui1 s =new SimpleGui1();
        s.go();
    }
    public void go(){
        JFrame frame = new JFrame();
        btn= new JButton("Cleck me");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(btn);
        frame.setSize(300,300);
        frame.setVisible(true);
        btn.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        btn.setText("I've been clicked!");
    }
}
