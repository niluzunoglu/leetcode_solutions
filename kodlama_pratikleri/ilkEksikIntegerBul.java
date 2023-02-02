import java.util.*;

public class ilkEksikIntegerBul {

    public static int ilkEksikSayiyiBulma(int[] numbers) {
        
        Arrays.sort(numbers);
        
        for(int i=1;i<numbers.length;i++){

            if(numbers[i-1]>0 & numbers[i] != numbers[i-1]+1){
                return numbers[i-1]+1;
            }
        }

        return numbers[numbers.length-1]+1;
    }

    public static void main(String[] args) {

        int[] numbers = {3,4,-1,1};
        System.out.println(ilkEksikSayiyiBulma(numbers));
    }
}
