/*
Given an array nums consisting of 2n elements in the form
[x1,x2,...,xn,y1,y2,...,yn].

Return the array in the form:
[x1,y1,x2,y2,...,xn,yn].

Example:

Input:
nums = [2,5,1,3,4,7]
n = 3

Output:
[2,3,5,4,1,7]
*/
package Week2;
import java.util.*;

class Task2ShuffleArray {

    public int[] shuffle(int[] nums, int n) {

        int[] result = new int[nums.length];

        int index = 0;

        for (int i = 0; i < n; i++) {

            result[index] = nums[i];
            index++;

            result[index] = nums[i + n];
            index++;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[] nums = new int[2 * n];

        System.out.println("Enter " + (2 * n) + " array elements:");

        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        Task2ShuffleArray obj = new Task2ShuffleArray();

        int[] result = obj.shuffle(nums, n);

        System.out.print("Shuffled Array: ");

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

        sc.close();
    }
}