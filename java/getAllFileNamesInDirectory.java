	/**
	 * Gets all file names in a directory (NON-RECURSIVELY)
	 */
	static List<String> getAllFileNamesInDirectory(String directory) {
		File[] folder = new File(directory).listFiles();
		List<String> fileNames = new ArrayList<>();
		for (File f : folder) {
			if (f.isFile()) {
				fileNames.add(f.getName());
			}
		}
		return fileNames;
	}
