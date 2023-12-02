// 4613732
//find the sum of the even-valued terms (fibonacci)
public class AJohnson2 {
    public static void main(String[] args) {
        int size = 4000000;
        int fib = 1;
        int fib1 = 1;
        int sum = 0; 

        // 
       while (fib1 < size){
        // checking if next fib number is even
        if (fib1 % 2 == 0){
            sum += fib1;
        }
        
        // calculate/update
        int fibonacci = fib + fib1;
        fib = fib1;
        fib1 = fibonacci;
    }

        System.out.println("Sum of positive numbers: "+ sum);
  
    }
}
