/*
 * INPUT:
 * 6 3
 * 5 3 5 2 3 2
 *
 * OUTPUT:
 * Maximum Unique Elements: 3
 *
 * Given a sequence of integers, find the maximum number of unique
 * integers among all possible contiguous subarrays of size m.
 *
 * This program demonstrates Java Deque.
 */
package Week2;
import java.util.*;
class Task9JavaDequeue{
    public int findMaximumUnique(int[] arr,int m){
        Deque<Integer> deque=new ArrayDeque<>();
        Map<Integer,Integer> frequency=new HashMap<>();
        int maximum=0;
        for(int i=0;i<arr.length;i++){
            deque.addLast(arr[i]);
            frequency.put(arr[i],frequency.getOrDefault(arr[i],0)+1);
            if(deque.size()==m){
                maximum=Math.max(maximum,frequency.size());
                int removed=deque.removeFirst();
                frequency.put(removed,frequency.get(removed)-1);
                if(frequency.get(removed)==0){
                    frequency.remove(removed);
                }
            }
        }
        return maximum;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n=sc.nextInt();
        System.out.print("Enter window size: ");
        int m=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Task9JavaDequeue obj=new Task9JavaDequeue();
        int result=obj.findMaximumUnique(arr,m);
        System.out.println("Maximum Unique Elements: "+result);
        sc.close();
    }
}