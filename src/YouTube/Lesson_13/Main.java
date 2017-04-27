package YouTube.Lesson_13;

import java.util.Random;

/**
 * Created by qurub on 27.04.2017.
 */
public class Main {
    public static void main(String[] args) {
        Thread thread_1 = new Thread(new Run("1"));
        Thread thread_2 = new Thread(new Run("2"));
        Thread thread_3 = new Thread(new Run("3"));
        thread_1.start();
        thread_2.start();
        thread_3.start();
    }
}
class Run implements Runnable{
    int time;
    String name;
    Random r = new Random();

    public Run(String name) {
        this.name = name;
        time = r.nextInt(1000);
    }

    @Override
    public void run() {
        System.out.printf("Thread %s sleep %d\n",name,time);
        try {
            Thread.sleep(time);
            System.out.printf("Thread %s wake up\n",name);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

