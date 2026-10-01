class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int maxValue=Integer.MIN_VALUE;
        int maxKey=0;
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            if(entry.getValue()>maxValue){
                maxKey=entry.getKey();
                maxValue= entry.getValue();
            }

        }
        return maxKey;
    }
}