import java.util.*;

public class harfNotunuBul{

    public static String harfKarsiliginiBul(int note) {
        
        Map<Integer,String> myMap = new TreeMap<Integer,String>(Collections.reverseOrder());

        myMap.put(0,"FF");
        myMap.put(30,"FD");
        myMap.put(50,"DD");
        myMap.put(60,"CC");
        myMap.put(65,"CB");
        myMap.put(70,"BB");
        myMap.put(80,"BA");
        myMap.put(90,"AA");


        for(Integer i:myMap.keySet()){
            
            if(note>=i) return myMap.get(i);
    
        }

        return "Error";
    }

    public static void main(String[] args) {

        System.out.println(harfKarsiliginiBul(90));
        System.out.println(harfKarsiliginiBul(66));
        System.out.println(harfKarsiliginiBul(30));

    }
}
