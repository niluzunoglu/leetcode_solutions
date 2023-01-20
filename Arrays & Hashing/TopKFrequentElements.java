import java.util.*;


public class TopKFrequentElements {

    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer,Integer> numsMap = new HashMap<>();
        int[] result = new int[k];

        for(int i=0;i<nums.length;i++){

            if(numsMap.containsKey(nums[i])){
                numsMap.put(nums[i],numsMap.get(nums[i])+1);
            }
            else{
                numsMap.put(nums[i],1);
            }
        }

        // Sorting map by value
        List<Entry<Integer, Integer>> nlist = new ArrayList<>(numsMap.entrySet());
        nlist.sort(Entry.comparingByValue());
        
        Iterator<Entry<Integer, Integer>> iter = nlist.iterator();

        for(int i=0;i<nlist.size()-k;i++){
            iter.next();
        }

        for(int i=nlist.size(),j=1;i>nlist.size()-k;i--,j++){
            result[k-j] = iter.next().getKey();
        }
        return result;
    }    
