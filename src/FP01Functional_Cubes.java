package src;

import java.util.List;

public class FP01Functional_Cubes {
    public static void main(String[] args) {
        publicFunctionalCubesListAllNumbers(List.of(12,67,89,65,1,56,94,2,100));
    }

    private static void publicFunctionalCubesListAllNumbers(List<Integer> numbers) {
        numbers.stream().map(number->number*number*number).
                forEach(System.out::println);

    }
}