package src;

import java.util.List;

public class FP02Functional_Max {
    public static void main(String[] args) {
        List<Integer> numbers=List.of(12,34,4,56,78,9,2,43,123,23);
        int max= publicFunctionalMaxOfNumbers(numbers);
        System.out.println(max);
    }



    private static int publicFunctionalMaxOfNumbers(List<Integer> numbers) {
      //  return numbers.stream().reduce(0,(x,y)->x>y?x:y);
        return numbers.stream().reduce(Integer.MAX_VALUE,(x,y)->x<y?x:y);
    }
}
