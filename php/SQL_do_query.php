

function do_query($query) { // FIXME: ? if success or not on query
    try {
        $db = oci_connect('test', 'root', '');
        if (!$db) { exit(); }
        $req = oci_parse($db, $query);
        oci_execute($req);
        oci_free_statement($req);
        oci_close($db);
    } catch (Exception $e) {
        // XXX: do something here
    }
}
