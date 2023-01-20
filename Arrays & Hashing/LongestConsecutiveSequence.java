class LongestConsecutiveSequence {
    public int longestConsecutive(int[] numbers) {
        
        if(numbers.length == 0) return 0;
        int result=1;
        int max_result = 1;

        int[] nums =  java.util.stream.IntStream.of(numbers).distinct().toArray();

        Arrays.sort(nums);

        for(int i=1;i<nums.length;i++){

            if(nums[i]-nums[i-1] == 1) result += 1;

            else result=1;

            if (result>max_result) max_result=result; 

        }

        return max_result; 
    }
}
