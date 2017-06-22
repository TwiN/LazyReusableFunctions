// USAGE: changeUrl('title of the page (this feature isnt supported yet anyways)', 'index.jsp');
function changeUrl(page, url) {
    if (typeof (history.pushState) != "undefined") {
        var obj = {Page: page, Url: url};
        history.pushState(obj, obj.Page, obj.Url);
    } else {
    	// browser doesn't support HTML5
    }
}
