/* 
 * This is not really a 'function' per se. it isn't as fast to implement
 * either, but I thought this could come in handy in the future
 */


////////////
// SCRIPT //
////////////

/**
 * Creates a status bar
 * @param s  Current status (pending, validated, in progress or completed)
 */
function createStatusBar(s) {
	var s = s.toLowerCase().replace(' ', '');
	// delete the status bar if it already exists
	$("#statusBarContainer").remove(); 
	// prepend the status bar to the container
	$("body").prepend(''
		+ '<div id="statusBarContainer">'
		+ '  <div id="statusBar">'
		+ '    <div id="status_pending">Pending</div>'
		+ '    <div id="status_validated">Validated</div>'
		+ '    <div id="status_inprogress">In progress</div>'
		+ '    <div id="status_completed">Completed</div>'
		+ '  </div>'
		+ '</div>');
    $("#status_"+s).addClass("current");
}


/////////
// CSS //
/////////

/* status bar */
#statusBar {
	width: 100%;
	height: 50px;
	text-align: center;
	font-size: 120%;
	position: absolute;
	margin-top: 25px;
}
#statusBar>div {
	position: relative;
	display: inline-block;
	background-color: #006400;
	width: 20%;
	height: 35px;
	line-height: 35px;
	vertical-align: middle;
	border-radius: 5px;
	border-top-right-radius: 30px;
	border-bottom-right-radius: 30px;
	border: 2px solid black;
	color: rgba(255, 255, 255, 0.2);
	text-shadow: 0 0 1px rgba(255, 255, 255, 0.5);
}
/* after current status */
#statusBar .current ~ div { 
	background-color: grey;
}
#statusBar div.current {
	background-color: green;
	color: white;
	text-shadow: 0px 0px 4px #000000;
}
#status_pending { z-index: 50; left: 30px; }
#status_validated { z-index: 49; left: 10px; }
#status_inprogress { z-index: 48; left: -10px; }
#status_completed {	z-index: 47; left: -30px; }
