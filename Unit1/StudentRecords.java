import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class StudentRecords {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of students:");
        int n=sc.nextInt();
        sc.nextLine();
        List<String> studentNames=new ArrayList<>();
        for(int i=0;i<n;i++){
            System.out.print("enter student name:"+" ");
            String name=sc.nextLine();
            studentNames.add(name);
        }
        studentNames.forEach(name -> System.out.print(name + " "));
        sc.close();   
    }
}