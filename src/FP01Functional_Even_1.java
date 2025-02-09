package src;

import java.util.List;

public class FP01Functional_Even_1 {

    public static void main(String[] args) {
        publicFunctionalEvenListOfNumbers(List.of(12,34,4,56,78,9,2,43,123,23));
    }


    private static void publicFunctionalEvenListOfNumbers(List<Integer> numbers) {
        numbers.stream().filter(number->number%2==0).
                forEach(System.out::println);
    }
}
