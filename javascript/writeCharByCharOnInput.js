/**
 * Writes a string character by character with a random delay between each
 * character on an input.
 * @inputId  Id of the input to write on
 * @text  String to write on the input
 */
function writeCharByCharOnInput(inputId, text) {
    var sz = text.length;
    document.getElementById(inputId).value += text[0];
    if (sz > 1) {
        setTimeout(function(){
            writeCharByCharOnInput(inputId, text.replace(text[0], ""));
        }, Math.random()*400);
    }
}

// USAGE: writeCharByCharOnInput("someInputId", "What is love?");
