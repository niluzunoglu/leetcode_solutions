public class olmayanSayiyiBulma {

    public static int findLostInteger(int[] numbers) {
        
        Arrays.sort(numbers);

        for(int i=0;i<numbers.length;i++){
            if(numbers[i] != i+1){
                return i+1;
            }

            else {}
        }

        return 0;
    }

    public static void main(String[] args) {

        int[] numbers = {5,2,4,1,6};

        System.out.println(findLostInteger(numbers));
    }
}
