// 31875000
// pythag triplet 
public class AJohnson9 {
    public static void main(String[] args) {
        int sum = 1000; 
        int product = findProduct(sum);
        System.out.println("product: "+ product);
    }
    // method finds triplet
    private static int findProduct(int sum){
        for (int a = 1; a < sum / 3; a++ ){
            for (int b = a+1; b < sum/2; b++){
                int c = sum - a - b; 
                // checking if the value of a,b, or c form triplet
                // return if found
                if (a * a + b * b == c *c){ 
                    return a * b * c;
                }
            }
        }
        // shouldnt run this line. no triplet found = -1
        return -1; 
    }

}
