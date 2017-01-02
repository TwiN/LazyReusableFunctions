/**
 * Compresses a file using GZIP
 * @param fileName Name of the file to compress
 * @param deleteAfterCompress Whether to delete the file after compression
 * @return Whether the compression has been successful or not
 */
public static boolean gzip(String fileName, boolean deleteAfterCompress) {
    try {
        FileInputStream is = new FileInputStream(fileName);
        FileOutputStream os = new FileOutputStream(fileName+".gz");
        GZIPOutputStream gzipOs = new GZIPOutputStream(os);
        byte[] buffer = new byte[1024];
        int len;
        while((len=is.read(buffer)) != -1){
            gzipOs.write(buffer, 0, len);
        }
        gzipOs.close();
        os.close();
        is.close();
    } catch (IOException e) {
        e.printStackTrace();
        return false;
    }
    return (new File(fileName)).delete();
}
