package Book.Chapter_6.anonymousInnerClass;

import javax.swing.*;

/**
 * Created by Kirill on 08.03.2017.
 */
public class AnonymousInnerClassTest {
    public static void main(String[] args) {
        TalkingClock clock = new TalkingClock();
        clock.start(1000, true);

        JOptionPane.showMessageDialog(null, "Quit?");
        System.exit(0);
    }
}
