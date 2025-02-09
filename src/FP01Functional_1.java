package src;

import java.util.List;

public class FP01Functional_1 {

    public static void main(String[] args) {
        publicFunctionalListOfNumbers(List.of(12,34,4,56,78,9,2,43,123,23));
    }

    private static void publicFunctionalListOfNumbers(List<Integer> numbers) {
        numbers.stream().forEach(System.out::println);
    }
}

