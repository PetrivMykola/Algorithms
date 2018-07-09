package substring;

import java.util.LinkedList;
import java.util.List;

/**
 * Given a string, find the length of the longest substring without repeating characters.
 *
 * Examples:
 *
 * Given "abcabcbb", the answer is "abc", which the length is 3.
 *
 * Given "bbbbb", the answer is "b", with the length of 1.
 *
 * Given "pwwkew", the answer is "wke", with the length of 3.
 * Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
public class Solution {

    public int lengthOfLongestSubstring(String s) {

        char[] arrays = s.toCharArray();
        List<Character> characters = new LinkedList<>();

        for (int i = 0; i < arrays.length - 1; i++) {
            for (int j = i + 1; j < arrays.length; j++) {

                if (arrays[i] != arrays[j]) {
                    characters.add(arrays[i]);
                    characters.add(arrays[j]);

                }
            }

        }
        return 0;

    }

    private boolean isNextUnique(char[] chars, char next) {
        boolean result = true;

        for (char c : chars) {
            if (c == next) {
                result = false;
            }
        }

        return result;
    }
}
