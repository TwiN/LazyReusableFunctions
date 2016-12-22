/**
 * Checks if the number passed as argument is prime
 * @param n Number to check
 * @return Whether the number is prime or not
 */
public static boolean isPrime(int n) {
    if (n <= 1) {
        return false;
    } else if (n == 2) {
        return true;
    }
    int limit = (int)Math.sqrt(n);
    for (int i = 2; i <= limit; i++) {
        if (n % i == 0) {
            return false;
        }
    }
    return true;
}
