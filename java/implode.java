/**
 * Converts a String array into a string separated by the separator passed
 * as parameter
 * @param separator String to put between every element of the array
 * @param array List to convert
 * @return String of the array with a separator between each elements
 */
public static String implode(String separator, String[] array) {
    if (array == null) { return ""; }
    String result = "";
    for (int i = 0; i<array.length; i++) {
        result += array[i]+""+(array.length-1==i?"":separator);
    }
    return result;
}
