// 18044195
// What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20
public class AJohnson5 {
    public static void main(String[] args) {
        // print method results
        System.out.println("Smallest number: " + findSmallestMultiple(20));
    }

    // finds smallest multiple to 20
    private static int findSmallestMultiple(int max){
        int lcm = 1;

        // find numbers to 20
        for (int i = 2; i <= 20; i++) {
            // find lcm 
            lcm = lcm * i / findGCD(lcm, i);
        }
        return lcm; 
    }

    // finds the gcd 
    private static int findGCD(int gcd1, int gcd2) {
        while (gcd2 > 0) {
            // swaps and updates gcd2 to remainder of division
            int temp = gcd2;
            gcd2 = gcd1 % gcd2;
            gcd1 = temp;
        }
        return gcd1;
    }


}
