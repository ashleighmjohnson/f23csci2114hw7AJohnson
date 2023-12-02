// 233168
// If we list all the natural numbers below 10 that are multiples of 3 or,5 we get 3, 5, 6 and 9. 
// The sum of these multiples is 23. Find the sum of all the multiples of 3 or 5 below 100.

public class AJohnson1{
    public static void main(String[] args) {
        int sum = 0; 
        int limit = 1000;

        // loop number - limit amount
        for (int check = 1; check < limit; check++){
            // checking if current number is 3 or 5
            if (check % 3 == 0 || check % 5 == 0){
                sum+=check;
            }
        }

        System.out.println("Sum of multiples at " + limit + ": "+ sum);
    }
}