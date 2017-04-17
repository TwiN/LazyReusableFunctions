// USAGE: print_query('SELECT table_name FROM user_tables', 'test', 'root', '');

function print_query($query, $dbuser, $dbpass, $dbinst='') {
    // connect to the database
    $db = oci_connect($dbuser, $dbpass, $dbinst);
    if (!$db) {
        echo "ERROR: Failed to connect to the database!";
        exit();
    }
    $req = oci_parse($db, $query);
    oci_execute($req);
    // Parse result in array
    $cols = oci_num_fields($req);
    echo '<table border="1">';
    while ($l = oci_fetch_array ($req, OCI_RETURN_NULLS)) {
        echo '<tr>';
        for ($i = 0; $i < $cols; $i++) {
            echo '<td>'.$l[$i].'</td>';
        }
        echo '</tr>';
    }
    echo '</table>';
    // disconnect from the database
    oci_free_statement ($req);
    oci_close($db);
}

