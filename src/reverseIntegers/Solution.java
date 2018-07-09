package reverseIntegers;

/**
 * Given a 32-bit signed integer, reverse digits of an integer.
 * <p>
 * Example 1:
 * Input: 123
 * Output: 321
 * <p>
 * Example 2:
 * Input: -123
 * Output: -321
 * <p>
 * Example 3:
 * Input: 120
 * Output: 21
 * <p>
 * Note:
 * Assume we are dealing with an environment which could only store integers within the 32-bit signed integer.
 * For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
 */

public class Solution {

    public int reverse(int x) {

        long input = x;
        long result = 0;
        boolean isNegative = false;

        if (input < 0) {
            input = 0 - input;
            isNegative = true;
        }

        while(input != 0){
            result *= 10;
            result += input % 10;
            input /= 10;
        }

        if(result > Integer.MAX_VALUE) return 0;

        return isNegative  ? 0 - ((int)result) : (int)result;

    }
}
