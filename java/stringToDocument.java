// USAGE: Document document = string2Document(str);
public static Document string2Document(String contents) {
    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
    DocumentBuilder builder;
    Document document = null;
    try {
        builder = factory.newDocumentBuilder();
        document = builder.parse(new InputSource(new StringReader(contents)));
        document.getDocumentElement().normalize();
    } catch (Exception e) {
        System.out.println("Unable to convert string to Document: "
                + e.getMessage());
    }
    return document;
}
