package src;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Course_3 {
    private String name;
    private String Category;
    private int reviewScore;
    private int noOfStudents;

    public Course_3(String name, String category, int reviewScore, int noOfStudents) {
        this.name = name;
        Category = category;
        this.reviewScore = reviewScore;
        this.noOfStudents = noOfStudents;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public int getReviewScore() {
        return reviewScore;
    }

    public void setReviewScore(int reviewScore) {
        this.reviewScore = reviewScore;
    }

    public int getNoOfStudents() {
        return noOfStudents;
    }

    public void setNoOfStudents(int noOfStudents) {
        this.noOfStudents = noOfStudents;
    }

    @Override
    public String toString() {
        return name+":"+noOfStudents+":"+reviewScore;

    }
}

public class FP04CustomClass_3 {

    public static void main(String[] args) {

        List<Course_2> cours = List.of(new Course_2("Spring","Framework",98,20000),
                new Course_2("Spring Boot","Framework",95,12000),
                new Course_2("API","Microservices",97,21000),
                new Course_2("Microservices","Microservices",96,20000),
                new Course_2("FullStack","FullStack",99,12000),
                new Course_2("AWS","Cloud",91,14000),
                new Course_2("Azure","Cloud",93,52000),
                new Course_2("Docker","Cloud",92,82000),
                new Course_2("Kubernetes","Cloud",94,12000));

        //  System.out.println(cours.stream().allMatch(reviewscoreLessThan90CoursePredicate()));

        Comparator<Course_2> comparingByNoOfStudents= Comparator.comparing(Course_2::getNoOfStudents);
        Comparator<Course_2> comparingByNoOfStudentsIncreasing= Comparator.comparing(Course_2::getNoOfStudents).reversed();
        System.out.println(cours.stream().sorted(comparingByNoOfStudentsIncreasing).collect(Collectors.toList()));

        Comparator<Course_2> comparingByNoOfStudentsAndReview= Comparator.comparing(Course_2::getNoOfStudents).thenComparing(Course_2::getReviewScore).reversed();

        System.out.println(cours.stream().sorted(comparingByNoOfStudentsAndReview).collect(Collectors.toList()));
        System.out.println(cours.stream().sorted(comparingByNoOfStudentsAndReview).limit(5).collect(Collectors.toList()));
        System.out.println(cours.stream().sorted(comparingByNoOfStudentsAndReview).skip(5).collect(Collectors.toList()));
        System.out.println(cours.stream().sorted(comparingByNoOfStudentsAndReview).skip(5).limit(4).collect(Collectors.toList()));


        //Return all the elements of the list until the elements do not meet a specific criteria

        System.out.println(cours.stream().takeWhile(course2 -> course2.getReviewScore()>94).collect(Collectors.toList()));

        //As long as a particular condition is true it skips the elements
        System.out.println(cours.stream().dropWhile(course2 -> course2.getReviewScore()>94).collect(Collectors.toList()));

        //Which is the top course when we are comparing by the no of students and reviews
        System.out.println(cours.stream().max(comparingByNoOfStudentsAndReview));

        //How to return something if it doesn't find a default
        System.out.println(cours.stream().filter(reviewscoreLessThan90CoursePredicate())
                .min(comparingByNoOfStudentsAndReview).orElse(new Course_2("Kubernetes","Cloud",94,12000)));

        //Filter elements by predicate and then find the first element which meets specific criteria
        System.out.println(cours.stream().filter(reviewscoreGreaterThan90CoursePredicate()).findFirst());

        //Return any of the elements of the list which match the specific criteria
        System.out.println(cours.stream().filter(reviewscoreGreaterThan95CoursePredicate()).findAny());


        System.out.println(cours.stream().filter(reviewscoreGreaterThan95CoursePredicate()).mapToInt(Course_2->Course_2.getNoOfStudents()).sum());

        System.out.println(cours.stream().filter(reviewscoreGreaterThan95CoursePredicate()).mapToInt(Course_2->Course_2.getNoOfStudents()).average());

        System.out.println(cours.stream().filter(reviewscoreGreaterThan95CoursePredicate()).mapToInt(Course_2->Course_2.getNoOfStudents()).count());

        System.out.println(cours.stream().filter(reviewscoreGreaterThan95CoursePredicate()).mapToInt(Course_2->Course_2.getNoOfStudents()).max());

        //Grouping and mapping
        System.out.println(cours.stream().collect(Collectors.groupingBy(Course_2::getCategory)));

        System.out.println(cours.stream().collect(Collectors.groupingBy(Course_2::getCategory, Collectors.counting())));

        System.out.println(cours.stream().collect(Collectors.groupingBy(Course_2::getCategory, Collectors.maxBy(Comparator.comparing(Course_2::getReviewScore)))));

        System.out.println(cours.stream().collect(Collectors.groupingBy(Course_2::getCategory, Collectors.mapping(Course_2::getName,Collectors.toList()))));

        //Making streams directly

        System.out.println(Stream.of(12,45,89,8,5,8,9,78, 123).count());

        System.out.println(Stream.of(12,45,89,8,5,8,9,78, 123).reduce(0, Integer::sum));

        int[] numberArray = {12,45,89,8,5,8,9,78, 123};

        System.out.println(Arrays.stream(numberArray).average());

        //Doesn't take the last element

        System.out.println(IntStream.range(1,10).sum());

        //Takes the last Element

        System.out.println(IntStream.rangeClosed(1,10).sum());

        //Generate specific set of values
        System.out.println();

    }

    private static Predicate<Course_2> reviewscoreGreaterThan90CoursePredicate() {
        return course2 -> course2.getReviewScore() > 90;
    }
    private static Predicate<Course_2> reviewscoreGreaterThan95CoursePredicate() {
        return course2 -> course2.getReviewScore() > 95;
    }

    private static Predicate<Course_2> reviewscoreLessThan90CoursePredicate() {
        return course2 -> course2.getReviewScore() < 90;
    }

}
