class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        
        int[] result = new int[nums.length];
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        int product=1;

        left[0] = 1;
        right[nums.length-1] = 1;

        for(int i=1;i<nums.length;i++){
            product *= nums[i-1];
            left[i] = product;
        }

        product=1;
        for(int i=nums.length-1;i>0;i--){

            product *= nums[i];
            right[i-1] = product;
        }       

        for(int i:right){ System.out.println(i);}

        for(int i=0;i<nums.length;i++){
            result[i] = left[i] * right[i];
        }

        return result;
    }
}
