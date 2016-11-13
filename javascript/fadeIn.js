// Assuming that element starts with opacity 0 (if not, then just
// element.style.opacity = 0; before calling the function)

function fadeIn(element, timeBeforeFadeInMs) {
    setTimeout(function() {
        var fOp = 0.1;
        var timer = setInterval(function () {
            if (fOp >= 1){
                clearInterval(timer);
            }
            element.style.opacity = fOp;
            fOp += fOp * 0.2;
        }, 50);
    }, timeBeforeFadeInMs);
}
