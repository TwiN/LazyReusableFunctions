/**
 * Returns the date in a YYYY-MM-DD format
 */
function getToday() {
	var d = new Date();
	return d.getFullYear() + "-" + ((d.getMonth()+1)<10?'0':'') + (d.getMonth()+1) + "-" + (d.getDate()<10?'0':'') + d.getDate();
}
