import java.util.Stack;

public class palindrome {

    public static boolean isPalindrome(String str) {
        Stack<Character> stack = new Stack<>();
        int length = str.length();
        int halfLength = length / 2;
        for (int i = 0; i < halfLength; i++) {
            stack.push(str.charAt(i));
        }
        int startSecondHalf = length - halfLength;
        for (int i = startSecondHalf; i < length; i++) {
            if (stack.isEmpty() || stack.pop() != str.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String palindrome1 = "racecar";
        String palindrome2 = "level";
        String nonPalindrome = "hello";

        System.out.println(palindrome1 + " is a palindrome? " + isPalindrome(palindrome1));
        System.out.println(palindrome2 + " is a palindrome? " + isPalindrome(palindrome2));
        System.out.println(nonPalindrome + " is a palindrome? " + isPalindrome(nonPalindrome));
    }
}

