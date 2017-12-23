
// USAGE: var content = stripTag(content, "iframe");
function stripTag(content, tag) {
    let div = document.createElement('div');
    div.innerHTML = content;
    let tags = div.getElementsByTagName(tag);
    let i = tags.length;
    while (i--) {
        tags[i].parentNode.removeChild(tags[i]);
    }
    return div.innerHTML;
}

