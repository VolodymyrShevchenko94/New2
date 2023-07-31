package Daemon;

/**
 * Створіть Daemon-потік і виведіть про нього якнайбільше інформації.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Main thread starts");
        UserThread userThread = new UserThread();
        userThread.setName("notDaemon");
        DaemonThread daemonThread = new DaemonThread();
        daemonThread.setName("Daemon");
        daemonThread.setDaemon(true);
        userThread.start();
        daemonThread.start();
        System.out.println("Daemon thread ID: " + daemonThread.getId());
        System.out.println("Daemon thread name: " + daemonThread.getName());
        System.out.println("Daemon thread state: " + daemonThread.getState());
        System.out.println("Daemon thread: " + daemonThread.isAlive());
        System.out.println("Daemon thread status: " + daemonThread.isDaemon());
        System.out.println("Daemon thread priority: " + daemonThread.getPriority());
        System.out.println("Main thread ends");

    }
}