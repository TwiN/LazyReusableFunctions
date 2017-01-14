<?php
function getBetween($content, $start, $end) {
    $r = explode($start, $content);
    return (isset($r[1]))?explode($end, $r[1])[0]:'';
}
