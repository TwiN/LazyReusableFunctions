/**
 * Function that gets the size of a file in bytes
 * @param fullPath Path of the file
 * @return File size in bytes
 */
public static long getFileSizeInByte(String fullPath) {
  File f = new File(fullPath);
  return (f.length());
}


/**
 * Function that gets the size of a file in KB
 * @param fullPath Path of the file
 * @return File size in KB
 */
public static double getFileSizeInKb(String fullPath) {
  return (double)getFileSizeInByte(fullPath)/1024d;
}


/**
 * Function that gets the size of a file in MB
 * @param fullPath Path of the file
 * @return File size in MB
 */
public static double getFileSizeInMb(String fullPath) {
  return (double)getFileSizeInKb(fullPath)/1024d;
}
