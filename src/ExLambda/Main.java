package ExLambda;

/**
 * Напишіть основні арифметичні дії калькулятора, використовуючи лямбда-вирази
 */



public class Main {
    public static void main(String[] args) {
        Operation add = (x, y) -> x + y;
        Operation sub = (x, y) -> x - y;
        Operation mult = (x, y) -> x * y;
        Operation div = (x, y) -> x / y;

        System.out.println(add.calculate(5, 10));
        System.out.println(sub.calculate(5, 10));
        System.out.println(mult.calculate(5, 10));
        System.out.println(div.calculate(10, 2));


    }
}