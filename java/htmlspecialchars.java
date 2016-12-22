/**
 * Convert special HTML characters into their HTML entity equivalent
 * @param s String to sanitize
 * @return Sanitized/safe string
 */
public static String htmlspecialchars(String s) {
    String result = "";
    for (int i = 0; i<s.length(); i++) {
        char c = s.charAt(i);
        switch(c) {
            case '<': result += "&lt;"; break;
            case '>': result += "&gt;"; break;
            case '&': result += "&amp;"; break;
            case '"': result += "&quot;"; break;
            case '\'': result += "&apos;"; break;
            default: result += c;
        } 
    }
    return result;
}

