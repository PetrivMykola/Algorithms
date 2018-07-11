package mergeTwoArrayIntegers;

import java.util.Arrays;

/**
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 * <p>
 * Note:
 * <p>
 * The number of elements initialized in nums1 and nums2 are m and n respectively.
 * You may assume that nums1 has enough space (size that is greater or equal to m + n)
 * to hold additional elements from nums2.
 * <p>
 * Example:
 * <p>
 * Input:
 * nums1 = [1,2,3,0,0,0], m = 3
 * nums2 = [2,5,6],       n = 3
 * <p>
 * Output: [1,2,2,3,5,6]
 */

public class Solution {

    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int index = 0;
        int len = m;

        while (index < n) {
            nums1[len] = nums2[index];
            index++;
            len++;
        }

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 1; j < (nums1.length - i); j++) {
                if (nums1[j - 1] > nums1[j]) {
                    //swap elements
                    int temp = nums1[j - 1];
                    nums1[j - 1] = nums1[j];
                    nums1[j] = temp;
                }
            }
        }
        return nums1;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int n = 3;
        int m = 3;

        System.out.println(Arrays.toString(Solution.merge(nums1, m, nums2, n)));
    }
}
