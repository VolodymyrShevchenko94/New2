package Ex7;

/**
 * Створити список та заповнити рандомними числами 10 осередків, потрібно вивести суму квадратів усіх елементів списку.
 * Ми використовуємо метод map() для зведення квадрат кожного елемента, а потім застосовуємо метод reduce() для обʼєднання всіх елементів в одне число.
 */



import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int numberElements = 10;
        ArrayList<Integer> someList = fillingList(numberElements);

        CalcSum calcSum = new CalcSum();
        System.out.println(calcSum.calcSum(someList));


    }


    public static ArrayList<Integer> fillingList(int numberElements) {
        Random random = new Random();
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < numberElements; i++) {
            result.add(random.nextInt(100) + 1);
        }
        return result;
    }


}