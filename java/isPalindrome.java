/**
 * Checks if the given String is a palindrome.
 * @param s String to check
 * @return Whether the String <i>s</i> is a palindrome or not
 */
public static boolean isPalindrome(String s) {
    for (int i = 0; i < s.length()/2; i++) {
        if (s.charAt(i) == s.charAt(s.length()-1-i)) {
            continue;
        } else {
            return false;
        }
    }
    return true;
}

