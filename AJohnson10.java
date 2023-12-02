// 142913828922
// Find the sum of all the primes below two million.
public class AJohnson10 {
    public static void main(String[] args) {
        int max = 2000000;
        long sum = 0;

        // loop to the max
        for (int i = 2; i < max; i++) {
           // if current number is prime, its added to the sum
            if (isPrime(i)) {
                sum += i;
            }
        }
        // result print
        System.out.println("2 million prime sum: "+ sum);
    }
    // checks if a number is prime
    private static boolean isPrime(int number) {
        // less than 2 = not prime
        if (number < 2) {
            return false;
        }
        // checks factors 2 - sqrt of number
        for (int i = 2; i <= Math.sqrt(number); i++) {
            // factor found = not prime number
            if (number % i == 0) {
                return false;
            }
        }
        // no factors = prime number
        return true;
    }
}
