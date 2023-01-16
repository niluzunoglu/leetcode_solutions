// 242. Valid Anagram Solution

class validAnagram {
    public boolean isAnagram(String s, String t) {
        
        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();

        for(char i : s.toCharArray()) set1.add(i);
        for(char i : t.toCharArray()) set2.add(i);

        return (set1.containsAll(set2));
    }
}
