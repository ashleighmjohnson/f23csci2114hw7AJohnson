// 4782
// What is the index of the first term in the Fibonacci sequence to contain 1000 digits
import java.math.BigInteger;

public class AJohnson25 {
    public static void main(String[] args) {
        int thousand = 1000; 
        System.out.println(findIndex(thousand));
    }

    // finds index of first fib number
    private static int findIndex(int thousand){
        // big int handles large integers
        BigInteger fib = BigInteger.ONE;
        BigInteger fib1 = BigInteger.ONE; 

        // first two fib numbers are 1 so start at 2
        int index = 2;
    
    // loop until fib number has the needed digit num
    while (fib1.toString().length() < thousand){
    // swap + calculate next fib nums
        BigInteger temp = fib1; 
        fib1 = fib1.add(fib);
        fib = temp; 
        index++; 
    }
    // return index of first fib number w needed number of digit 
    return index; 
}
}
