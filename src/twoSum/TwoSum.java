package twoSum;

import java.util.Arrays;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * <p>
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * <p>
 * Example:
 * <p>
 * Given nums = [2, 7, 11, 15], target = 9,
 * <p>
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 *
 * @author Mykola Petriv
 */

public class TwoSum {

    private static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        boolean foundResult = false;

        for (int i = 0; i <= nums.length - 1; i++) {
            if (!foundResult) {
                for (int j = nums.length - 1; j > i; j--) {

                    if (nums[i] + nums[j] == target) {
                        result[0] = i;
                        result[1] = j;
                        foundResult = true;
                    }

                    if (foundResult) break;
                }

            } else break;

        }
        return result;
    }

    public static void main(String[] args) {
        int[] digits = {1, 5, 6, 8};
        int target = 9;

        System.out.println(Arrays.toString(TwoSum.twoSum(digits, target)));
    }
}
