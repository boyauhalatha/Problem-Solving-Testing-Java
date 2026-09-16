/*Write a Java program to count the number of even and odd elements in a matrix */
import java.util.*;
public class EvenAndOdd{
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };
        long evenCount = Arrays.stream(matrix)
                .flatMapToInt(Arrays::stream)
                .filter(n -> n % 2 == 0)
                .count();
        long oddCount = Arrays.stream(matrix)
                .flatMapToInt(Arrays::stream)
                .filter(n -> n % 2 != 0)
                .count();

        System.out.println("Even elements: " + evenCount);
        System.out.println("Odd elements: " + oddCount);
    }
}