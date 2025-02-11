package src;

import java.util.List;
import java.util.stream.Collectors;

public class FP02StreamOperations {
    public static void main(String[] args)
    {
        List<Integer> fgu= List.of(12,34,56,78,90,12,78);
        List<Integer> ghy= publicFunctionalEven(fgu);
        System.out.println(ghy);
    }
    public static List<Integer> publicFunctionalEven(List<Integer> ghy)
    {
        return ghy.stream().filter(x->x%2==0).collect(Collectors.toList());
    }
}
