import java.util.*;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
        Set<Integer> numset = new HashSet<Integer>(list);

        return (nums.length == numset.size()) ? false : true ;
    }
}
