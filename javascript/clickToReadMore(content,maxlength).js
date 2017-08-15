function clickToReadMore(content, MAX_LENGTH) {
    if (content.length > MAX_LENGTH) {
        content = content.substr(0, MAX_LENGTH) 
            + "<span onclick='this.innerHTML=atob(\""+btoa(content.substr(MAX_LENGTH))+"\")'>"
            + "<span style='cursor:pointer;color:#337ab7;'>[...]</span></span>";
    }
    return content;
}
