/**
 * Removes everything after the last "." in a String
 * WARNING: If you pass a file such as example.exe.png is passed as 
 * parameter, you might NOT get the desired effect!
 * <pre>
 * {@code
 * String path = "C:/some/path/example.txt";
 * System.out.println(stripExtension(path)); 
 * > C:/some/path/example
 * }
 * </pre>
 * @param s String to remove the extension from
 * @return String without its previous
 */
public static String stripExtension(String s) {
    return s.indexOf('.') > -1 ? s.substring(0, s.lastIndexOf('.')) : s;
}

