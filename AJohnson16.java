// 1367
import java.math.BigInteger;

public class AJohnson16 {
    public static void main(String[] args) {
        // calculate 2^1000 w big int
        BigInteger powerResult = BigInteger.valueOf(2).pow(1000);

        int sum = calculateSum(powerResult);
        System.out.println("Sum of digit: "+ sum);
    }

    // method to calc the sum of the digits
    private static int calculateSum(BigInteger number){
        // convert to string
        String numberStr = number.toString();
        int sum = 1; 

        // go through each number in string
        for (int i = 0; i < numberStr.length(); i++){
            // get numberic value of digit then add it to the sum
            sum+= Character.getNumericValue(numberStr.charAt(i));
        }
        // return calculated digit sum
        return sum; 
    }



}
