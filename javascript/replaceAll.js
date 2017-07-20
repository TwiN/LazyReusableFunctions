/**
 * Replaces all instance of the String search by the String replacement
 * NOTE: Make sure to escape characters like $, [, ], ...
 */
String.prototype.replaceAll = function(search, replacement) {
    return this.replace(new RegExp(search, 'g'), replacement);
};

