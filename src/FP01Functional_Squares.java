package src;

import java.util.List;

public class FP01Functional_Squares {
    public static void main(String[] args) {
        publicFunctionalEvenSquaresListAllNumbers(List.of(12,67,89,65,1,56,94,2,100));
    }

    private static void publicFunctionalEvenSquaresListAllNumbers(List<Integer> numbers) {
        numbers.stream().filter(number->number%2==0).map(number->number*number).
                forEach(System.out::println);

    }
}
