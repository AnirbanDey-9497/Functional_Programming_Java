package src;

import java.util.List;
import java.util.stream.Collectors;

public class FP02_Collectors {
    public static void main(String[] args) {
        List<Integer> number= List.of(12,67,89,65,1,56,94,2,100);
        List<Integer> square= publicFunctionalOddListAllNumbers(number);
        System.out.println(square);
    }

    private static List<Integer> publicFunctionalOddListAllNumbers(List<Integer> numbers) {
       return numbers.stream().map(number->number*number)
               .collect(Collectors.toList());


    }
}
