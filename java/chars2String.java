public static String chars2String(char[] c) {
	String str = "";
	int x = 0;
	while (x <= c.length-1) {
		str += ""+c[x++];
	}
	return str;
}
