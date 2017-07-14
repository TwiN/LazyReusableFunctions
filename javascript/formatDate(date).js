/**
 * Returns a YYYY-MM-DD hh:mm:ss timestamp
 * @date Date object
 */
function formatDate(date) {
	date = new Date(date);
	var YYYY = date.getFullYear();
	var MM = ((date.getMonth()+1)<10?"0":"")+""+(date.getMonth()+1);
	var DD = ((date.getDate())<10?"0":"")+""+(date.getDate());
	var hh = ((date.getHours())<10?"0":"")+""+(date.getHours());
	var mm = ((date.getMinutes())<10?"0":"")+""+(date.getMinutes());
	var ss = ((date.getSeconds())<10?"0":"")+""+(date.getSeconds());
	return YYYY+"-"+MM+"-"+DD+" "+hh+":"+mm+":"+ss;
}
