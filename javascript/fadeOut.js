function fadeOut(element, timeBeforeFadeInMs) {
	element.style.opacity = 1;
	setTimeout(function() {
		var fOp = 1;
		var timer = setInterval(function () {
			if (fOp <= 0.01){
				clearInterval(timer);
			}
			element.style.opacity = fOp;
			fOp -= fOp * 0.2;
		}, 10);
	}, timeBeforeFadeInMs);	
	element.style.display = "none";
	element.style.visibility = "hidden";
}
