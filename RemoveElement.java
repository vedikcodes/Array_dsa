package VEDIK.COM;
/* Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.

Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:

Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
Return k.
 */
public class RemoveElement {

    // Method to print an array
    public static void printArray(int[] arr, int length) {
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Method to remove all occurrences of val and return the new length (k)
    public static int removeElement(int[] nums, int val) {
        int count = 0;

        // Shift elements not equal to val to the front
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[count] = nums[i];
                count++;
            }
        }

        return count;  // This is the value of k
    }

    public static void main(String[] args) {
        int nums[] = { 3, 3, 2, 2, 3 };

        // Print the original array
        System.out.print("Original array: ");
        printArray(nums, nums.length);

        // Remove elements equal to 3 and get the new length (k)
        int k = removeElement(nums, 3);

        // Print the modified array up to the new length (k)
        System.out.print("Modified array: ");
        printArray(nums, k);

        // Print the value of k
        System.out.println("The value of k (new length) is: " + k);
    }
}
