package src;

import java.util.List;

public class FP01Structured_Even {

    public static void main(String[] args) {
        publicStructuredEvenListOfNumbers(List.of(12,34,4,56,78,9,2,43,123,23));
    }

    private static void publicStructuredEvenListOfNumbers(List<Integer> numbers) {
        for(int number:numbers)
        {
            if(number%2==0) {
                System.out.println(number);
            }
        }
    }
}

