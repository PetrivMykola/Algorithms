package longestCommonPrefix;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 * <p>
 * If there is no common prefix, return an empty string "".
 * <p>
 * Example 1:
 * <p>
 * Input: ["flower","flow","flight"]
 * Output: "fl"
 * <p>
 * Example 2:
 * <p>
 * Input: ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 * Note:
 * <p>
 * All given inputs are in lowercase letters a-z.
 */
public class Solution {

    public static String longestCommonPrefix(String[] strs) {

        if (strs.length == 0) return "";
        if (strs.length == 1) return strs[0];

        ArrayList<Integer> lenghts = new ArrayList<>();
        for (String s : strs) {
            lenghts.add(s.length());
        }
        Collections.sort(lenghts);

        String result = "";
        boolean ismatch = false;
        int amountWords = strs.length;
        int minLenght = lenghts.get(0);

        for (int i = 0; i < minLenght; i++) {
            char firstChar = strs[0].charAt(i);

            for (int j = 1; j < amountWords; j++) {
                if (String.valueOf(strs[j].charAt(i)).equals(String.valueOf(firstChar))) {
                    ismatch = true;
                } else {
                    ismatch = false;
                    break;
                }
            }

            if (ismatch) {
                result = result.concat(String.valueOf(firstChar));
            } else break;
        }

        return result;
    }

    public static void main(String[] args) {
        String[] array = {"aca","cba"};

        String str = Solution.longestCommonPrefix(array);

        System.out.println(str);
    }
}
