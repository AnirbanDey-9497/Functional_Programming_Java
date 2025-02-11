package src;

import java.util.List;

public class FP02Functional_OddSumOfSquares {
    public static void main(String[] args) {
        List<Integer> numbers=List.of(12,34,4,56,78,9,2,43,123,23);
        int sum_square= publicFunctionalSumOfSquaresOfNumbers(numbers);
        System.out.println(sum_square);
    }



    private static int publicFunctionalSumOfSquaresOfNumbers(List<Integer> numbers) {
        //  return numbers.stream().reduce(0,(x,y)->x>y?x:y);
        return numbers.stream().filter(number->number%2==1).map(number->number*number).
                reduce(0,(x,y)->x+y);
    }
}

