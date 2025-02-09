package src;

import java.util.List;

public class FP01Functional_Odd {

    public static void main(String[] args) {
        publicFunctionalOddListAllNumbers(List.of(12,67,89,65,1,56,94,2,100));
    }

    private static void publicFunctionalOddListAllNumbers(List<Integer> numbers) {
        numbers.stream().filter(number->number%2==1).forEach(System.out::println);

    }
}
