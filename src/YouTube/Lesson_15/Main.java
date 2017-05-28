package YouTube.Lesson_15;

import javax.swing.*;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * Created by qurub on 29.04.2017.
 */
public class Main extends JFrame implements Runnable {
    static private Socket socket;
    static private ObjectOutputStream output;
    static private ObjectInputStream input;
    public static void main(String[] args) {

    }

    @Override
    public void run() {

        try {
            socket = new Socket(InetAddress.getByName("127.0.0.1"),1488);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
