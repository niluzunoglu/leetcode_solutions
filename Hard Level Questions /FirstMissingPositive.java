class FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        
        int missingNumber = 1;
        boolean isSorted = true;
        
        Arrays.sort(nums);
                
        for(int i=1;i<nums.length;i++){
            
            int temp = 0;
            
            if(nums[i-1] == missingNumber){
                missingNumber += 1;    
            }
            
            
            if(nums[i] - nums[i-1] != 1){
                
                isSorted = false;
                
                temp = nums[i-1] + 1;

                if (temp <= missingNumber && temp >= 1) {
                    missingNumber = temp;
                }
            }  

        }
        
        if(nums[nums.length-1] == missingNumber){
            return missingNumber + 1;
        }
        
        if ((isSorted == true && nums[0]>1)||(isSorted == true && nums[nums.length-1] < 1 )){
            return 1;
        }
        
        if (isSorted == true ){
            return nums[nums.length-1]+1;
        }
        
        return missingNumber;
    }
}
