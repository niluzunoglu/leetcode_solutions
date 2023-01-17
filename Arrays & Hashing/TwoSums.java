class TwoSums {
    public int[] twoSum(int[] nums, int target) {

        int[] solution = new int[2];

        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){

                if(i==j){}
                else if(nums[j]+nums[i] == target) {
                    solution[0]=i;
                    solution[1]=j;
                    return solution;
                }; 
            }
        }
        return solution;
    }
}
