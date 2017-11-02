// lowercase letter
public static char getRandomLowercaseLetter() {
    return (char)((int)'a'+Math.random()*((int)'z'-(int)'a'+1));
}

// uppercase letter
public static char getRandomUppercaseLetter() {
    return (char)((int)'A'+Math.random()*((int)'Z'-(int)'A'+1));
}

