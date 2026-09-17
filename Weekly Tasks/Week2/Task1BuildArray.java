/*
Given a zero-based permutation nums, build an array ans of the same length
where ans[i] = nums[nums[i]].
Example:

Input:
nums = [0,2,1,5,3,4]

Output:
[0,1,2,4,5,3]
*/
package Week2;
import java.util.*;
class Task1BuildArray {
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        Task1BuildArray obj = new Task1BuildArray();
        int[] result = obj.buildArray(nums);
        System.out.print("Build Array: ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        sc.close();
    }
}