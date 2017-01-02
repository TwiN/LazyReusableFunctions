/**
 * Checks if String <i>ip</i> is a valid IPv4
 * @param ip String to check
 * @return Whether <i>ip</i> is a valid IPv4
 */
public static boolean isValidIPv4(String ip) {
    return ip.matches("\\A(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)"
            + "(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}\\z");
}
