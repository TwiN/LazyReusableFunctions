function buildTable(row, col) {
    document.write("<table>");
    for (var i = 0; i < row; i++) {
        document.write("  <tr>");
        for (var j = 0; j < col; j++) {
            document.write("    <td> </td>");
        }
        document.write("  </tr>");
    }
    document.write("</table>");
}
