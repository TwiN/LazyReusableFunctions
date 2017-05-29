function download(fileName, content) {
  var elem = document.createElement('a');
  elem.setAttribute('href', 'data:text/plain;charset=utf-8,' + encodeURIComponent(content));
  elem.setAttribute('download', fileName);
  document.body.appendChild(elem);
  elem.click();
  document.body.removeChild(elem);
}
