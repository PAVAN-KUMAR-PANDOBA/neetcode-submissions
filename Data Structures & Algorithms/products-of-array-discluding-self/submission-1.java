class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];
        int preProduct=1;
        int sufProduct=1;

        for(int i=1;i<nums.length;i++){
            preProduct*=nums[i-1];
            prefix[i]=preProduct;
        }
        for(int i=nums.length-2;i>=0;i--){
            sufProduct*=nums[i+1];
            suffix[i]=sufProduct;

        }
        prefix[0]=1;
        suffix[nums.length-1]=1;
        for(int i=0;i<nums.length;i++){
            nums[i]=suffix[i]*prefix[i];
        }

        return nums;
        
    }
}  
