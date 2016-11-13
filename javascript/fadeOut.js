// assuming that the element has an opacity of 1 (if not, then just 
// element.style.opacity = 1; before calling the function)

function fadeOut(element, timeBeforeFadeInMs) {
    setTimeout(function() {
        var fOp = 1;
        var timer = setInterval(function () {
            if (fOp <= 0.01){
                clearInterval(timer);
            }
            element.style.opacity = fOp;
            fOp -= fOp * 0.2;
        }, 50);
    }, timeBeforeFadeInMs);	
}
