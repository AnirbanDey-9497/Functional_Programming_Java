package src;

import java.util.List;

public class FP02Structured_Add {
    public static void main(String[] args) {
        List<Integer> numbers=List.of(12,34,4,56,78,9,2,43,123,23);
        int sum= publicStructuredAdditionOfNumbers(numbers);
        System.out.println(sum);
    }


    private static int publicStructuredAdditionOfNumbers(List<Integer> numbers) {
        int sum=0;
        for(int number:numbers)
        {
            sum=sum+number;
        }
        return sum;
    }
}
