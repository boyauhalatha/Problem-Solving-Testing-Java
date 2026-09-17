/*
 * INPUT:
 * 5
 * 1 1 2 2 3
 *
 * OUTPUT:
 * Array after removing duplicates: 1 2 3
 *
 * Given an integer array nums sorted in non-decreasing order,
 * remove the duplicates in-place.
 */
package Week2;
import java.util.*;
class Task4RemoveDuplicates{
    public int removeDuplicates(int[] nums){
        if(nums.length==0){
            return 0;
        }
        int k=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.println("Enter sorted array elements:");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        Task4RemoveDuplicates obj=new Task4RemoveDuplicates();
        int k=obj.removeDuplicates(nums);
        System.out.print("Array after removing duplicates: ");
        for(int i=0;i<k;i++){
            System.out.print(nums[i]+" ");
        }
        sc.close();
    }
}