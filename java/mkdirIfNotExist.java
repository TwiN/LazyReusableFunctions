/**
 * Creates a directory at the given path if it doesn't already exist
 * @param pathToDir Path to the directory (e.g. /home/twin/DIRECTORY_NAME)
 * @return Whether the directory was created (true) or already existed (false)
 */
public static boolean mkdirIfNotExist(String pathToDir) {
    File dir = new File(pathToDir);
    if (!dir.exists()) {
        if (dir.mkdir()) {
            return true; // directory was created 
        }
    }
    return false; // directory already exists
}
