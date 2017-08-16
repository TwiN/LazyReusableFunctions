/**
 * Gets the nth occurrence of a pattern in a string
 * @param pattern  Pattern to search
 * @param n  Nth occurrence
 * @return index of nth occurrence or -1 if not found
 */
String.prototype.nthIndexOf = function(pattern, n) {
	var index = -1;
	while (n-- && index++ < this.length) {
		index = this.indexOf(pattern, index);
		if (index < 0) { break; }
	}
	return index;
}
