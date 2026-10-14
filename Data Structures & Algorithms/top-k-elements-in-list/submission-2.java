class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer> list = new ArrayList<>();

        Map<Integer,Integer> map = new HashMap<>();
        for(int i: nums){
            map.put(i,map.getOrDefault(i,0)+1);

        }

        list.addAll(map.keySet());
        list.sort((a, b) -> map.get(b) - map.get(a));

        int[] array = new int[k];
        for(int i=0;i<k;i++){
            array[i]=list.get(i);
        }

        return array;
        
    }
}
