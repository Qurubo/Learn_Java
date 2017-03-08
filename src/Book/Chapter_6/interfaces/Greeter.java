package Book.Chapter_6.interfaces;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * Created by Kirill on 05.03.2017.
 */
class Greeter {
    public void greet() {
        System.out.println("Hello world");
    }
}
class TimedGreeter extends Greeter{
    @Override
    public void greet() {
        Timer t = new Timer(10000, (e) -> super.greet( ));
        t.start();
    }
}
