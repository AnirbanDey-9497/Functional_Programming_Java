package src;

import java.util.Comparator;
import java.util.List;

public class FP02_Comparator {
    public static void main(String[] args) {
        List<String> courses = List.of("Spring","Spring Boot","API","Microservices","AWS","PCF","Azure","Docker","Kubernetes");
        publicListAllDefinedStrings(courses);

    }



    private static void  publicListAllDefinedStrings(List<String> numbers) {
        //  return numbers.stream().reduce(0,(x,y)->x>y?x:y);
        numbers.stream().sorted(Comparator.comparing(str->str.length())).forEach(System.out::println);
    }
}
