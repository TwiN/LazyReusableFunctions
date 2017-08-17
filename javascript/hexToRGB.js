function hexToRGB(hex) {
	var rgb = "";
	hex = hex.replace("#", ""); // removes the # (if there is one)
	if (hex.length == 3) { // #FFF
		rgb = "RGB("+parseInt(hex.substr(0,1)+hex.substr(0,1), 16) + "," + parseInt(hex.substr(1, 1)+hex.substr(1, 1), 16)+ ","+parseInt(hex.substr(2, 1)+hex.substr(2, 1), 16)+")";
	} else { // #FFFFFF
		rgb = "RGB("+parseInt(hex.substr(0,2), 16) + "," + parseInt(hex.substr(2, 2), 16)+ ","+parseInt(hex.substr(4, 2), 16)+")";
	}
	return rgb;
}

/////////////
// EXAMPLE //
/////////////

<html>
<head>
    <script>
        function hexToRGB(hex) {
            hex = hex.replace("#", "");
            document.body.style.backgroundColor = "#"+hex;
            var rgb = "";
            if (hex.length == 3) {
                rgb = "RGB("+parseInt(hex.substr(0,1)+hex.substr(0,1), 16) + "," + parseInt(hex.substr(1, 1)+hex.substr(1, 1), 16)+ ","+parseInt(hex.substr(2, 1)+hex.substr(2, 1), 16)+")";
                } else {
                rgb = "RGB("+parseInt(hex.substr(0,2), 16) + "," + parseInt(hex.substr(2, 2), 16)+ ","+parseInt(hex.substr(4, 2), 16)+")";
            }
            document.getElementById("rgb").innerHTML = rgb;
        }
    </script>
</head>
<body>
	<span>#</span><input type="text" onkeydown="this.dispatchEvent(new Event('change'));" onkeyup="this.dispatchEvent(new Event('change'));" onchange="hexToRGB(this.value)" maxlength="6" />
	<span id="rgb">RGB(0,0,0)</span>
</body>
</html>

