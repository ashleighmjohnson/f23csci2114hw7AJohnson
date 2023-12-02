// 104743
// What is the 10,001st prime number?
public class AJohnson7 {
    public static void main(String[] args) {
        int number = 2;

        while (true){
            if (checkPrime(number)){
            System.out.println("the prime number: "+ number);
            return; 
            }
            // increment number
            number++;
        }
    }

    // checks if number is prime
    private static boolean checkPrime(int num){
        // numbers less than 2 arent prime
        if (num < 2){ 
            System.out.println("False");
            return false; 
        }

        // check from 2 to the sq rt of the number
        for (int i = 2; i <= Math.sqrt(num); i++){
            // if factor is found then its not prime
            if (num % i == 0){
                return false;
            }
        }
        // no factors = prime
        return true;
    }

}
