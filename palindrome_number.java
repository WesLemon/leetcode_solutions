/*
Given an integer x, return true if x is palindrome integer.
An integer is a palindrome when it reads the same backward as forward.
For example, 121 is a palindrome while 123 is not.

Example 1:
Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.

Example 2:
Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

Example 3:
Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.

Constraints:
    -231 <= x <= 231 - 1
 */

public class palindrome_number {
    //my solution
    public static boolean isPalindrome(int x)
    {
        //edge cases
        if(x < 0 || x % 10 == 0 && x != 0)
        {
            return false;
        }

        String number = Integer.toString(x);
        String numberReversed = "";
        for(int i = number.length()-1; i >= 0; i--)
        {
            numberReversed = numberReversed + (number.charAt(i));
        }
        return number.equals(numberReversed);
    }

    //leetCode solution
    public static boolean isPalindromeBetter(int x)
    {
        //edge cases
        if(x < 0 || x % 10 == 0 && x != 0)
        {
            return false;
        }

        int numberReverse = 0;
        while(x > numberReverse)
        {
            numberReverse = numberReverse * 10 + x % 10;
            x /= 10;
        }

        //as middle number doesn't matter if x is odd, we can remove with numberReverse/10
        return x == numberReverse || x == numberReverse/10;
    }
}
