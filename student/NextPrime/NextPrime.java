public class NextPrime {
    public static Integer nextPrime(Integer n) {
        // Main: finds the next prime after n
        int temp = n + 1;
        while (!isPrime(temp)) {
            temp++;
        }
        return temp;
    }
    // Helper: checks if a number is prime
    public static boolean isPrime(int x) {
        // Use a loop up to sqrt(x)
        if (x < 2) return false;
        for (int i = 2; i<= Math.sqrt(x);i++) {
            if (x % i == 0)
                return false;
        }
        return true;
    }
}

//public class NextPrime {
//    public static Integer nextPrime(Integer n) {
//        // Start searching from the next integer greater than n
//        int temp = n + 1;
//        // Loop indefinitely until a prime is found
//        while (true) {
//            // Assume temp is prime until proven otherwise
//            boolean isPrime = true;
//            // Edge case: Numbers less than 2 are not prime
//            if (temp < 2) {
//                isPrime = false;
//            } else {
//                // Loop from 2 up to the square root of temp (inclusive)
//                // Any divisor in this range means temp is not prime
//                for (int i = 2; i <= Math.sqrt(temp); i++){
//                    // If temp is divisible by i, it is definitely not prime
//                    if (temp % i == 0) {
//                        isPrime = false; // Mark as non-prime
//                        break; // No need to check further divisors
//                    }
//                }
//            }
//            // If isPrime is still true, we've found our next prime
//            if (isPrime) return temp; // Found a prime, return it
//            // Otherwise, check the next number
//            temp++; // Try next candidate if not found
//        }
//    }
//}
