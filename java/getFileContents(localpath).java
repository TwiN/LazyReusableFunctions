public static String getFileContents(String fileName) {
    String contents = "";
    try {
        contents = new String(Files.readAllBytes(Paths.get(fileName)));
    } catch (IOException e) {
        System.out.println("Unable to convert file '"+fileName+"' to string: "
                + e.getMessage());
    }
    return contents;
}
