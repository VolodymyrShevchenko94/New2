package Ex;


import java.util.ArrayList;

public class CalcSum {
    public  int calcSum(ArrayList<Integer> someListInteger) {
        return someListInteger.stream().map(num -> num * num).reduce(0, Integer::sum);

    }


}