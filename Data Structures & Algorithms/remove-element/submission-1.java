class Solution {
    public int removeElement(int[] nums, int val) {
        int start =0;
        int end=0;
        while(start<=end && end<nums.length){
            if(nums[end]!= val) {
                nums[start++]=nums[end++];
            }
            else{
                end++;

            }

        }
        return start;


        
    }
}