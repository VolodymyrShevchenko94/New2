package Ex1;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

public class Worker implements Runnable {
    private String nameWorker;

    public Worker(String nameWorker) {
        this.nameWorker = nameWorker;
    }

    public String getNameWorker() {
        return nameWorker;
    }

    @Override
    public void run() {
        System.out.println("Потік " + getNameWorker() + " стартував роботу - " + LocalDateTime.now().toString());
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Потік " + getNameWorker() + " закінчив роботу - " + LocalDateTime.now().toString());
    }
}
