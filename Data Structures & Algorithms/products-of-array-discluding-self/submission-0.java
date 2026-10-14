class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] temp = new int[nums.length];
        int product=1;
        int numberOfZeroes=0;
        for(int i: nums) {
            if(i==0){
                numberOfZeroes+=1;

            }
            else{
                product*=i;
            }
              
        }
        if(numberOfZeroes>=2){
            return new int[nums.length];
        }
        if(numberOfZeroes==1) {
            for(int i=0;i<nums.length;i++){
                if(nums[i]==0){
                    temp[i]=product;
                }
                else{
                    temp[i]=0;
                }

            }
            return temp;
        }
        for(int i=0;i<nums.length;i++){
            temp[i]=product/nums[i];
        }
        return temp;
    }
}  
