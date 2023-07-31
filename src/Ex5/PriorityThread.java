package Ex5;

import java.util.concurrent.TimeUnit;

public class PriorityThread extends Thread {
    private String nameThread;

    public PriorityThread(String nameThread) {
        this.nameThread = nameThread;
    }

    public String getNameThread() {
        return nameThread;
    }

    public void run() {
        for (int i = 0; i <= 50; i++) {
            try {
                System.out.println(getNameThread() + " - Priority: " + getPriority() + " Number: " + i);
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException exception) {
                exception.printStackTrace();
            }
        }
    }
}