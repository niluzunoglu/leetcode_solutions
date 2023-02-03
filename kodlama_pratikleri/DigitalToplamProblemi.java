
public class DigitalToplamProblemi {

    public static String DTP_9(int i){
        
        // 9 a eşitse de buna gönder
        return "1" + Integer.toString(i-1);
    }

    public static String DTP(int i) {
        
        if(i<=9){
           return Integer.toString(i); 
        }

        else{
            return DTP(i-9) + "9";
        }
        
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if(number<=0){
            System.out.println("Error!");
        }
        if(number<=9){
            System.out.println(DTP_9(number));
        }
        else{
            System.out.println(DTP(number));
        }

        scanner.close();

        
    }
}
