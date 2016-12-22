/**
 * Gets the extension of a file or a path
 * @param fileNameOrPath Name of the file or path toward the file
 * @return The extension of the file
 */
public static String getExtension(String fileNameOrPath) {
    return fileNameOrPath.indexOf(".") > -1 ?
        fileNameOrPath.substring(fileNameOrPath.indexOf(".")+1) : "";
}
