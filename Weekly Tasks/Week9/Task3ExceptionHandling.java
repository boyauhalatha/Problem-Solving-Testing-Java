/*
 * TASK 5: JAVA EXCEPTION HANDLING
 *
 * PROBLEM STATEMENT:
 * Read two integers and perform integer division.
 * Handle exceptions using try-catch.
 *
 * If the input is not an integer, print:
 * java.util.InputMismatchException
 *
 * If the second number is zero, print:
 * java.lang.ArithmeticException: / by zero
 *
 * INPUT:
 * 10
 * 3
 *
 * OUTPUT:
 * 3
 */
package Week9;
import java.util.*;
public class Task3ExceptionHandling{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        try{
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.println(a/b);
        }catch(InputMismatchException e){
            System.out.println("java.util.InputMismatchException");
        }catch(ArithmeticException e){
            System.out.println("java.lang.ArithmeticException: / by zero");
        }
        sc.close();
    }
}