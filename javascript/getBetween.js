function getBetween(src, start, end) {
	var indexStart = src.indexOf(start);
	var indexEnd = src.indexOf(end, indexStart);
	return (indexEnd > indexStart && indexStart > -1) ? src.substring(indexStart + start.length, indexEnd) : '';
}
