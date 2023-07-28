package BlockThread;


/**
 * Створити 2 класи. Реалізувати взаємне блокування цих класів
 */

public class Main {
    public static void main(String[] args) {
        final AnimalX animalX = new AnimalX();
        final AnimalY animalY = new AnimalY();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    animalX.roar(animalY);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    animalY.growl(animalX);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread1.start();
        thread2.start();

    }
}
