// 906609
// Find the largest palindrome made from the product of two 3-digit numbers.
public class AJohnson4 {
    public static void main(String[] args) {
        int largePal = 0;

        // loop through combinations
        for (int i = 100; i < 1000; i++) {
            for (int j = 1; j < 1000; j++) {
                // find product
                int multiply = i * j;

                // this checks if the product is a palindrome and updates largest number
                if (isPalindrome(multiply) && multiply > largePal) {
                    largePal = multiply;
                }
            }
        }

        System.out.println("Largest palindrome: "+ largePal);
    }
    // method to check if number is palindrome 
    private static boolean isPalindrome(int number) {
        // convert int to string
        String numberSt = Integer.toString(number);
        // reverse string
        String reverseSt = new StringBuilder(numberSt).reverse().toString();
        // check if reverse and original are equal
        return numberSt.equals(reverseSt);
    }
}
