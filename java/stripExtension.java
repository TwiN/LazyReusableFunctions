/**
 * Removes everything after the first "." in a String
 * <pre>
 * {@code
 * String path = "C:/some/path/example.txt";
 * System.out.println(stripExtension(path)); 
 * > C:/some/path/example
 * }
 * </pre>
 * @param s String to remove the extension from
 * @return String without any extension
 */
public static String stripExtension(String s) {
    return s.indexOf('.') > -1 ? s.substring(0, s.indexOf('.')) : s;
}

