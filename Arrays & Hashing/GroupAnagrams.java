import java.util.*;

class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, List<String>> sortedChars = new HashMap<>();
        // {aet=[eat,tea,ate] , ant=[ant,tan,nat], abt=[bat]} 
        
        for(String word:strs){

            char[] letters = word.toCharArray();
            Arrays.sort(letters);
            String keyLetters = new String(letters);

            if(sortedChars.containsKey(keyLetters)){

                List<String> anagram_strings = sortedChars.get(keyLetters);
                anagram_strings.add(word);
                sortedChars.put(keyLetters, anagram_strings);
            }

            else{
                
                List<String> anagram_strings = new ArrayList<>(List.of(word));
                sortedChars.put(keyLetters,anagram_strings);
            }

        }
        
        List<List<String>> finalList = new ArrayList<List<String>>();

        for(List<String> i:sortedChars.values()){
            finalList.add(i);
        }

        return finalList;

    }
}
