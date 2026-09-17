/*
 * INPUT:
 * 9
 * -2 1 -3 4 -1 2 1 -5 4
 *
 * OUTPUT:
 * Maximum Subarray Sum: 6
 *
 * Given an integer array nums, find the subarray with the largest sum
 * and return its sum.
 */
package Week2;
import java.util.*;
class Task5MaximumSubarray{
    public int maxSubArray(int[] nums){
        int currentSum=nums[0];
        int maxSum=nums[0];
        for(int i=1;i<nums.length;i++){
            currentSum=Math.max(nums[i],currentSum+nums[i]);
            maxSum=Math.max(maxSum,currentSum);
        }
        return maxSum;
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
        Task5MaximumSubarray obj=new Task5MaximumSubarray();
        int result=obj.maxSubArray(nums);
        System.out.println("Maximum Subarray Sum: "+result);
        sc.close();
    }
}
