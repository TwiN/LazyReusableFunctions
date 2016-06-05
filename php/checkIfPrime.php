function checkIfPrime($num) {
    $isPrime = true;
    if ($num == 1) { 
        return false; 
    } else if ($num == 2) { 
        return true; 
    }
    $xLimit = sqrt($num);
    $xLimit = floor($xLimit);
    for ($i = 2; $i<=$xLimit; ++$i) {
        if ($num % $i == 0) {
            $isPrime = false;
            break;
        }
    }
    return ($isPrime);
}