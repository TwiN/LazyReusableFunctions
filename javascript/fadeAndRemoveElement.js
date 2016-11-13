/**
 * Function that fades the element 2 seconds after being called and
 * deletes the element after it faded
 */
function fadeAndRemove(element, elementParent) {
    setTimeout(function() {
        var fOp = 1;
        var timer = setInterval(function () {
            if (fOp <= 0.01){
                clearInterval(timer);
                elementParent.removeChild(element);
            }
            element.style.opacity = fOp;
            fOp -= fOp * 0.1;
        }, 50);
    }, 2000);
}
