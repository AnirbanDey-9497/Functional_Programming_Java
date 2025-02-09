package src;

import java.util.List;

public class FP01Structured {

    public static void main(String[] args) {
        publicStructuredListOfNumbers(List.of(12,34,4,56,78,9,2,43,123,23));
    }

    private static void publicStructuredListOfNumbers(List<Integer> numbers) {
        for(int number:numbers)
        {
            System.out.println(number);
        }
    }
}
