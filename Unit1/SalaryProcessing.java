/*2. Employee Salary Processing — Transformation
Given:
List<Integer> salaries = Arrays.asList(25000, 35000, 42000, 28000, 50000);
Write a Java program using:
map() → increase every salary by 10%
mapToInt() → convert the salaries to integer values
forEach() → display the updated salaries
Expected output:
27500
38500
46200
30800
 */
import java.util.List;
import java.util.Arrays;
public class SalaryProcessing {
    public static void main(String[] args){
        List<Double> salaries =Arrays.asList(50000.0, 60000.0, 70000.0, 80000.0, 90000.0);
        salaries.stream()
            .map(salary -> salary * 1.1)
            .mapToInt(salary -> salary.intValue())
            .forEach(System.out::println);
    }   
}