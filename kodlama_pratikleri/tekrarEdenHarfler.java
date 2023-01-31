public class tekrarEdenHarfler {

    public static Map<Character,Integer> getRepeatedLetters(String sentence) {
        
        Map<Character,Integer> letterCount = new HashMap<>();
        String lowerSentence = sentence.toLowerCase();

        for(int i=0;i<lowerSentence.length();i++){

            if(lowerSentence.charAt(i) != ' ' ){

                if(letterCount.containsKey(lowerSentence.charAt(i))){
                    letterCount.put(lowerSentence.charAt(i), letterCount.get(lowerSentence.charAt(i)) + 1);
                }
                else{
                    letterCount.put(lowerSentence.charAt(i), 1);
                }
            }
            else{}
        }

        return letterCount;
    }

    public static void main(String[] args) {

        Map<Character,Integer> letterCount = getRepeatedLetters("Ali ata bak");
        
        System.out.println(letterCount);
    }
}
