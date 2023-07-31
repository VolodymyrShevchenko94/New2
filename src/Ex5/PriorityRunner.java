package Ex5;

/**
 * Демонстрація пріоритетів.
 * Створити 2 класи PriorityRunner та PriorityThread.
 * Запустити 3 потоки із пріоритетами (min, max, norm).
 * За допомогою циклу for виведемо на екран значення від 1 до 50 і вкажемо, який саме потік цю операцію робить.
 */
public class PriorityRunner {
    public static void main(String[] args) {
        PriorityThread maxPriority = new PriorityThread("Max Priority");
        PriorityThread minPriority = new PriorityThread("Min Priority");
        PriorityThread normPriority = new PriorityThread("Norm Priority");
        maxPriority.setPriority(Thread.MAX_PRIORITY);
        minPriority.setPriority(Thread.MIN_PRIORITY);
        normPriority.setPriority(Thread.NORM_PRIORITY);
        maxPriority.start();
        minPriority.start();
        normPriority.start();
    }
}