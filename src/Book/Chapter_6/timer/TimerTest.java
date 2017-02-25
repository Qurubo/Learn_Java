package Book.Chapter_6.timer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

/**
 * Created by Kirill on 25.02.2017.
 */
public class TimerTest {
    public static void main(String[] args) {
        ActionListener actionListener = new TimePrinter();
        //timer every 10 sec
        Timer timer = new Timer(10000,actionListener);
        timer.start();
        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}
class TimePrinter implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("At the tone, the time is "+ new Date());
        Toolkit.getDefaultToolkit().beep();
    }
}

