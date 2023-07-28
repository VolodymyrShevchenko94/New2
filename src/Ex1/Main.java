package Ex1;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Thread worker1 = new Thread(new Worker("Dmytro"));
        Thread worker2 = new Thread(new Worker("Oleg"));
        System.out.println("Потік " + Main.class.getSimpleName() + " стартував роботу - " + LocalDateTime.now());
        worker1.start();
        worker2.start();

        try {
            worker1.join();
            worker2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Потік " + Main.class.getSimpleName() + " закінчив роботу - " + LocalDateTime.now());
        System.out.println("Всі потоки завершили роботу");

    }
}