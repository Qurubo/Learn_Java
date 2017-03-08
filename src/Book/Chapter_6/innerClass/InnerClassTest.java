package Book.Chapter_6.innerClass;

import javax.swing.*;

/**
 * Created by Kirill on 08.03.2017.
 */
public class InnerClassTest {
    public static void main(String[] args) {
        TalkingClock clock = new TalkingClock(1000, true);
        clock.start();

        JOptionPane.showMessageDialog(null, "Quit?");
        System.exit(0);
    }
}
