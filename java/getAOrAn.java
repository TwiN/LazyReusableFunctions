public static String getAOrAn(String nextWord) {
	String r = "a";
	char c = nextWord.toLowerCase().charAt(0);
	if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
		r = "an";
	}
	return r;
}
