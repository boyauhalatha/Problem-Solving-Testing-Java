/*
Given an integer array nums and an integer val, remove all occurrences
of val in-place.

Return the number of elements remaining.

Example:

Input:
nums = [3,2,2,3]
val = 3

Output:
2
Array:
2 2
*/
package Week2;
import java.util.*;
class Task3RemoveElement {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
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
        System.out.print("Enter value to remove: ");
        int val = sc.nextInt();

        Task3RemoveElement obj = new Task3RemoveElement();

        int k = obj.removeElement(nums, val);

        System.out.println("Number of elements: " + k);

        System.out.print("Array after removing element: ");

        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }

        sc.close();
    }
}