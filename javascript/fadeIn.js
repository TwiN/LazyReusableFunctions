function fadeIn(element, timeBeforeFadeInMs) {
	element.style.opacity = 0.1;
	element.style.display = "block ";
	element.style.visibility = "visible";
	setTimeout(function() {
		var fOp = 0.1;
		var timer = setInterval(function () {
			if (fOp >= 1){
				clearInterval(timer);
			}
			element.style.opacity = fOp;
			fOp += fOp * 0.2;
		}, 10);
	}, timeBeforeFadeInMs);
}
