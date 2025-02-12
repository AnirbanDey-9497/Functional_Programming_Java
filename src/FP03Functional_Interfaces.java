package src;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FP03Functional_Interfaces {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 34, 4, 56, 78, 9, 2, 43, 123, 23);
         publicFunctionalSumOfSquaresOfNumbers(numbers);

    }


    private static void publicFunctionalSumOfSquaresOfNumbers(List<Integer> numbers) {
        //  return numbers.stream().reduce(0,(x,y)->x>y?x:y);
         numbers.stream().filter(getIntegerPredicate()).map(getFunction()).
                forEach(getConsumer());
    }

    private static Consumer<Integer> getConsumer() {
        return System.out::println;
    }

    private static Function<Integer, Integer> getFunction() {
        return number -> number * number;
    }

    private static Predicate<Integer> getIntegerPredicate() {
        return number -> number % 2 == 1;
    }
}