class Solution {
    public boolean isAnagram(String s, String t) {
        int[] nums = new int[256];
        int arrayLength= s.length();
        if(s.length()!=t.length()) return false;
        for(int i=0; i<arrayLength;i++) {
            nums[s.charAt(i)]++;
            nums[t.charAt(i)]--;

        }
        for(int i:nums){
            if(i!=0) return false;
        }

        return true;


    }
}
