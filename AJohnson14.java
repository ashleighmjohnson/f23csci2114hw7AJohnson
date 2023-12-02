//837799
// Which starting number, under one million, produces the longest chain? (q14)
import java.util.ArrayList;
import java.util.List;

public class AJohnson14 {
    public static void main(String[] args) {
        // finds starting value up to a million
        System.out.println(longestChain(1000000));
    }

    private static List <Long> sequence(long value){
       // list to store sequence 
        var list = new ArrayList<Long>();
        list.add(value);

        // generates seqience until value = 1
        while (value != 1){
            // if the value is even divide it by 2
            if (value % 2 == 0){
            list.add(value /= 2);
            } else {
                // odd value gets multiplied by 3 then add 1
                list.add(value = value * 3 + 1); 
            }
             
        }
        return list;
    }

    // find the starting value that gives the longest sequence
    private static long longestChain (long limit){
        // L = long
        var largest = 0L;
        var value = 0L;

        // goes through potential starting values, begins at 13
        for (var generate = 13L; generate < limit; generate++){
            // calculate the length for starting value
            var size = sequence(generate).size();
            
            // check if current sequence is longer than the longest one before
            var check = size > largest; 

            // if current sequence is longer the variables will update
            if(check){
                largest = size;
                value = generate;
            }
        }
        // returns longest variable
        return value;
    }

}
