// 242. Valid Anagram Solution

class validAnagram {
    public boolean isAnagram(String s, String t) {

        Hashtable<Character, Integer> s_ht = new Hashtable<Character, Integer>();
        Hashtable<Character, Integer> t_ht = new Hashtable<Character, Integer>();

        for(Character i: s.toCharArray() ){
            if (s_ht.get(i) == null) s_ht.put(i,1);
            else s_ht.put(i, s_ht.get(i) + 1);   
        }

        for(Character i: t.toCharArray() ){
            if (t_ht.get(i) == null) t_ht.put(i,1);
            else t_ht.put(i, t_ht.get(i) + 1);   
        }

        return (s_ht.equals(t_ht));
    }
}
