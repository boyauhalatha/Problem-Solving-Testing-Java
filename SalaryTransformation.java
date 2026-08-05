import java.util.Arrays;
import java.util.Scanner;
public class SalaryTransformation{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of Employees:");
        int n=sc.nextInt();
        int[] salaries=new int[n];
        System.out.println("Enter salaries of employees:" + " ");
        for(int i=0;i<n;i++){
            salaries[i]=sc.nextInt();
        }
        Arrays.stream(salaries)
                .map(salary -> salary + salary * 10 / 100)
                .forEach(salary -> System.out.print(salary +" "));
        sc.close();        
    }
}