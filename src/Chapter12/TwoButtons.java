package Chapter12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by qurub on 28.09.2016.
 */
public class TwoButtons {
    JFrame frame;
    JLabel label;
    public static void main(String[] args) {
        TwoButtons gui = new TwoButtons();
        gui.go();
    }
    public void go(){
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton labelbtn = new JButton("Change Label");
        JButton colorbtn = new JButton("Change Circle");

        labelbtn.addActionListener(new LabelListener());
        colorbtn.addActionListener(new ColorListener());

        label = new JLabel("I'm a label");
        MyDrawPanel drawPanel = new MyDrawPanel();

        frame.getContentPane().add(BorderLayout.SOUTH,colorbtn);
        frame.getContentPane().add(BorderLayout.CENTER,drawPanel);
        frame.getContentPane().add(BorderLayout.EAST,labelbtn);
        frame.getContentPane().add(BorderLayout.WEST,label);

        frame.setSize(300,300);
        frame.setVisible(true);
    }
    class LabelListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setText("Ouch!");
        }
    }
    class ColorListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            frame.repaint();
            frame.repaint();
        }
    }
}
