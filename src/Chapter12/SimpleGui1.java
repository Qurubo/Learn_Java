package Chapter12;

import javax.swing.*;

/**
 * Created by qurub on 26.09.2016.
 */
public class SimpleGui1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JButton btn = new JButton("Cleck me");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(btn);
        frame.setSize(300,300);
        frame.setVisible(true);
    }
}
