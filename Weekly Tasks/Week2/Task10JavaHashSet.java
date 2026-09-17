/*
 * INPUT:
 * 5
 * john tom
 * john mary
 * john tom
 * mary anna
 * anna tom
 *
 * OUTPUT:
 * 1
 * 2
 * 2
 * 3
 * 4
 *
 * Given pairs of strings, add each pair to a HashSet.
 * HashSet stores only unique elements.
 *
 * After every pair, print the number of unique pairs.
 */
package Week2;
import java.util.*;
class Task10JavaHashSet{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of pairs: ");
        int n=sc.nextInt();
        HashSet<String> set=new HashSet<>();
        System.out.println("Enter pairs:");
        for(int i=0;i<n;i++){
            String first=sc.next();
            String second=sc.next();
            String pair=first+" "+second;
            set.add(pair);
            System.out.println(set.size());
        }
        sc.close();
    }
}