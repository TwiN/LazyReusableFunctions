public static String getCurrentPath() {
	File file = new File("tmp.TMP_FILE");
	return  file.getAbsolutePath().replace("tmp.TMP_FILE", "");
}
