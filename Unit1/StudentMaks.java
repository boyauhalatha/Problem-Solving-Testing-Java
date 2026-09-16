/*1. Student Marks Processing — Basic + Transformation

Given a list of student marks:

List<Integer> marks = Arrays.asList(45, 78, 62, 90, 55, 81, 38);

Write a Java program using:

stream()
filter() → select marks ≥ 50
map() → add 5 grace marks
forEach() → display the final marks

Expected output: Display the updated marks of students who passed.
*/
import java.util.Arrays;
import java.util.List;
public class StudentMaks {
    public static void main(String[] args){
        List<Integer> marks = Arrays.asList(45, 78, 62, 90, 55, 81, 38);
        marks.stream()
            .filter(mark -> mark >= 50)
            .map(mark -> mark + 5)
            .forEach(mark -> System.out.print(mark + " "));
    }
}