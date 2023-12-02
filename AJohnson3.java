// 6857
// What is the largest prime factor of the number 600851475143
public class AJohnson3 {
    public static void main(String[] args) {
        // L lets the long act like int
        long number =  600851475143L;
        System.out.println("largest prime factor:" + findPrimeFactor(number));

    }

    // method finds the largest prime factor
    private static long findPrimeFactor(long num) {
        long i;
        // loops through 2 to num
        for (i = 2; i <= num; i++) {
           // if i is a factor divide num by 1 and i is decremented
            if (num % i == 0) {
                num /= i;
                i--;
            }
        }
        // last i value = largest prime number
        return i; 
    }
}
