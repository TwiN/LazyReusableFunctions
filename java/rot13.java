/**
 * Rotates the alphabetic characters in a string by 13 positions
 * @param s String to encrypt with rot13
 * @return Encrypted String
 */
public static String rot13(String s) {
    String result = "";
    for(int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        if ((c >= 'a' && c <= 'm') || (c >= 'A' && c <= 'M')) {
            c += 13;
        } else if ((c >= 'n' && c <= 'z') || (c >= 'N' && c <= 'Z')) {
            c -= 13;
        }
        result += c;
    }
    return result;
}

