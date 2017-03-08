package Book.Chapter_6.innerClass;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

/**
 * Created by Kirill on 08.03.2017.
 */
public class TalkingClock {
    private int interval;
    private boolean beep;

    public TalkingClock(int interval, boolean beep) {
        this.interval = interval;
        this.beep = beep;
    }

    public void start() {
        ActionListener a = new TimePrinter();
        Timer t = new Timer(interval,a);
        t.start();
    }
    public class TimePrinter implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Tone, the time is "+ new Date().toString());
            if(beep) Toolkit.getDefaultToolkit().beep();

        }
    }
}
