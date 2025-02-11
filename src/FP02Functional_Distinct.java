package src;

import java.util.List;

public class FP02Functional_Distinct {
    public static void main(String[] args) {
        List<Integer> numbers=List.of(12,34,4,56,78,9,2,43,123,23);
        publicFunctionalSumOfSquaresOfNumbers(numbers);

    }



    private static void publicFunctionalSumOfSquaresOfNumbers(List<Integer> numbers) {
        //  return numbers.stream().reduce(0,(x,y)->x>y?x:y);
         numbers.stream().distinct().forEach(System.out::println);
    }
}
