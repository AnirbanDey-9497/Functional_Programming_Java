package src;

import java.util.List;
import java.util.stream.Collectors;

public class FP02Functional_Courselength {
    public static void main(String[] args) {
        List<String> courses = List.of("Spring","Spring Boot","API","Microservices","AWS","PCF","Azure","Docker","Kubernetes");
        List<String> lengthOfCourse=publicListAllDefinedStrings(courses);
        System.out.println(lengthOfCourse);
    }

    private static List publicListAllDefinedStrings(List<String> courses) {
       return courses.stream().map(course->course+" "+course.length()).collect(Collectors.toList());
    }
}
