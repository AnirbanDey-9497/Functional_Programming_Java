package src;

import java.util.List;

public class FP02Functional_Add_1 {
    public static void main(String[] args) {
        List<Integer> numbers=List.of(12,34,4,56,78,9,2,43,123,23);
        int sum= publicFunctionalAdditionOfNumbers(numbers);
        System.out.println(sum);
    }



    private static int publicFunctionalAdditionOfNumbers(List<Integer> numbers) {
        return numbers.stream().reduce(0,(x,y)->x+y);
    }
}


