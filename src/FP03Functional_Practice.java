package src;

import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FP03Functional_Practice {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 34, 4, 56, 78, 9, 2, 43, 123, 23);
        publicFunctionalSumOfSquaresOfNumbers(numbers);
    }





    private static void publicFunctionalSumOfSquaresOfNumbers(List<Integer> numbers) {
        //  return numbers.stream().reduce(0,(x,y)->x>y?x:y);
        numbers.stream().map(getFunction()).collect(Collectors.toList());

    }

    private static Function<Integer, Integer> getFunction() {
        return x -> x * x;
    }

    public static Consumer<Integer> integerConsumer(){
       return System.out::println;

    }



}
