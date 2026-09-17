/*
 * INPUT:
 * 6
 * 1 1 1 2 2 3
 * 2
 *
 * OUTPUT:
 * Top K Frequent Elements: [1, 2]
 *
 * Given an integer array nums and an integer k,
 * return the k most frequent elements.
 */
package Week2;
import java.util.*;
class Task8TopKFrequent{
    public int[] topKFrequent(int[] nums,int k){
        Map<Integer,Integer> frequency=new HashMap<>();
        for(int num:nums){
            frequency.put(num,frequency.getOrDefault(num,0)+1);
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>(
            (a,b)->frequency.get(a)-frequency.get(b)
        );
        for(int num:frequency.keySet()){
            pq.offer(num);
            if(pq.size()>k){
                pq.poll();
            }
        }
        int[] result=new int[k];
        for(int i=k-1;i>=0;i--){
            result[i]=pq.poll();
        }
        return result;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.print("Enter K: ");
        int k=sc.nextInt();
        Task8TopKFrequent obj=new Task8TopKFrequent();
        int[] result=obj.topKFrequent(nums,k);
        System.out.print("Top K Frequent Elements: ");
        System.out.println(Arrays.toString(result));
        sc.close();
    }
}