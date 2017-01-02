/**
 * Checks if String <i>ip</i> is a valid IPv6
 * @param ip IP to check
 * @return Whether <i>ip</i> is a valid IPv6
 */
public static boolean isValidIPv6(String ip) {
    return ip.toUpperCase()
        .matches("\\A(?:[0-9A-F]{1,4}:){7}[0-9A-F]{1,4}\\z");
}
