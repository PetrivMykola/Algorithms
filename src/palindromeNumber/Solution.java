package palindromeNumber;

public class Solution {

    public static boolean isPalindrome(int x) {
        int reverse = 0;
        int input = x;

        if (x < 0) return false;

        while(x != 0){
            reverse *= 10;
            reverse += x % 10;
            x /= 10;
        }

        return input == reverse;
    }

    public static void main(String[] args) {

        System.out.println(Solution.isPalindrome(12121));
    }

}
