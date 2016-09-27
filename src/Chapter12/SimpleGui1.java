package Chapter12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by qurub on 26.09.2016.
 */
public class SimpleGui1 implements ActionListener {

    JFrame frame;
    public static void main(String[] args) {
        SimpleGui1 s =new SimpleGui1();
        s.go();
    }
    public void go(){
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton btn= new JButton("Change colors");
        btn.addActionListener(this);

        MyDrawPanel m =new MyDrawPanel();

        frame.getContentPane().add(BorderLayout.SOUTH,btn);
        frame.getContentPane().add(BorderLayout.CENTER,m);
        frame.setSize(300,300);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
       frame.repaint();
    }
}
