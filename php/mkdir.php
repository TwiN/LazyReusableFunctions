/**
 * Makes a directory if it doesnt already exist
 */
function makeDir($path) {
	return is_dir($path) || mkdir($path);
}
