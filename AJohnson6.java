// 25164150
// Find the difference between the sum of the squares of the first one hundred
// natural numbers and the square of the sum.
public class AJohnson6 {
    public static void main(String[] args) {

        int max = 100;
        int sum = 0;
        int square = 0;

        // find the sum of squares
        for (int i = 1; i <= max; i++) {
            sum += i * i;
        }
        // find the square of sums
        for (int i = 1; i <= max; i++) {
            square += i;
        }
        square = square * square;

        // calculating answer
        int result = Math.abs(square - sum);
        System.out.println(result);
    }
}