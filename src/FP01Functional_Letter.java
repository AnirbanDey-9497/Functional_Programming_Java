package src;

import java.util.List;

public class FP01Functional_Letter {
    public static void main(String[] args) {
        List<String> courses = List.of("Spring","Spring Boot","API","Microservices","AWS","PCF","Azure","Docker","Kubernetes");
        publicListAllDefinedStrings(courses);
    }

    private static void publicListAllDefinedStrings(List<String> courses) {
        courses.stream().filter(course->course.length()>3).
                forEach(System.out::println);
    }
}