public static boolean isInList(String[] myList, String element) {
    for(String s: myList) {
        if (s.equals(element)) { return true; }
    }
    return false;
}
public static boolean isInList(char[] myList, char element) {
    for(char c: myList) {
        if (c == element) { return true; }
    }
    return false;
}
public static boolean isInList(int[] myList, int element) {
    for(int i: myList) {
        if (i == element) { return true; }
    }
    return false;
}
public static boolean isInList(float[] myList, float element) {
    for(float i: myList) {
        if (i == element) { return true; }
    }
    return false;
}
public static boolean isInList(double[] myList, double element) {
    for(double i: myList) {
        if (i == element) { return true; }
    }
    return false;
}
