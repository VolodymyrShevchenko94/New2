package Daemon;

import java.util.concurrent.TimeUnit;

public class DaemonThread extends Thread {

    public void run() {
        for (int i = 0; i < 150; i++) {
            try {
                TimeUnit.MILLISECONDS.sleep(200);
                System.out.println( "hello, I am daemon " + i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
