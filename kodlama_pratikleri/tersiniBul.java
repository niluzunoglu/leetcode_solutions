public class tersiniBul {

    public static String tersiniBul(String word,int index) {
        
        if(index<word.length()) return tersiniBul(word, index+1) + word.charAt(index);
        else return "";
        
    }

    public static void main(String[] args) {

        System.out.println(tersiniBul("Muvaffakiyetsizleştiricileştiriveremeyebileceklerimizdenmişsinizcesine",0));
    }
}
