function svgDownloader() {
	var svg = document.getElementById("svg");
	var innerSvg = document.getElementById('innerSVG'); // first <g> in the svg
	
	var source = (new XMLSerializer()).serializeToString(svg);
	
	if (!source.match(/^<svg[^>]+xmlns="http\:\/\/www\.w3\.org\/2000\/svg"/)){
	    source = source.replace(/^<svg/, '<svg xmlns="http://www.w3.org/2000/svg"');
	}
	if (!source.match(/^<svg[^>]+"http\:\/\/www\.w3\.org\/1999\/xlink"/)){
	    source = source.replace(/^<svg/, '<svg xmlns:xlink="http://www.w3.org/1999/xlink"');
	}
	source = '<?xml version="1.0" standalone="no"?>\n' + source;
	
  // downloads the svg
  // @see https://github.com/TwinProduction/LazyReusableFunctions/tree/master/javascript
	download("filename.svg", source); 
}
