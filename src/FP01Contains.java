package src;

import java.util.List;

public class FP01Contains { public static void main(String[] args) {
    List<String> courses = List.of("Spring","Spring Boot","API","Microservices","AWS","PCF","Azure","Docker","Kubernetes");
    publicListAllDefinedStrings(courses);
}

    private static void publicListAllDefinedStrings(List<String> courses) {
        courses.stream().filter(course->course.contains("Spring")).
                forEach(System.out::println);
    }
}
