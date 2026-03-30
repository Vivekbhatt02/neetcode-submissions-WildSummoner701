class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int maxKey=0, maxValue=0;
        for(int num: nums){
            map.put(num, map.getOrDefault(num,0)+1);

            if(map.get(num)>maxValue){
                maxValue=map.get(num);
                maxKey=num;
            }
        }

        return maxKey;
    }
}