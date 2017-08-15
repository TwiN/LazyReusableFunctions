function clickToReadMore(content, maxlength) {
    if (content.length > MAX_TITLE_LENGTH) {
        content = content.substr(0, MAX_TITLE_LENGTH) 
            + "<span onclick='this.innerHTML=atob(\""+btoa(content.substr(MAX_TITLE_LENGTH))+"\")'>"
            + "<span style='cursor:pointer;color:#337ab7;'>[...]</span></span>";
    }
    return content;
}
