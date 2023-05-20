import java.util.*;

class MedianOfSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int len3 = (nums1).length + (nums2).length;
                
        int[] keyList = new int[len3];
        
        for(int i=0;i<(nums1).length;i++)
            keyList[i] = nums1[i];
        
        for(int i=0;i<(nums2).length ;i++)
            keyList[(nums1).length + i] = nums2[i];
        
        Arrays.sort(keyList);
                
        if(len3 % 2 == 1)
            return keyList[(len3-1)/2];
            
        else
            return Double.valueOf(keyList[len3/2] + keyList[(len3/2)-1])/2;
    
    }
}
