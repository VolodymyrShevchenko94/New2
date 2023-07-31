package Daemon;

import java.util.concurrent.TimeUnit;

import java.util.concurrent.TimeUnit;

public class UserThread extends Thread {
    public void run() {
        for (int i = 0; i < 20; i++) {
            try {
                TimeUnit.MILLISECONDS.sleep(300);
                System.out.println( "I am not daemon " + i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}