class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length<1){
            return 0;
        }
        Set<Integer> numbers = new HashSet<>();
        for(int num:nums){
            numbers.add(num);
        }

        int longestSubsequent=1;
        for(int num:numbers){
            if(numbers.contains(num-1)){
                continue;
            }else{
                int currentSubsequent=1;
                int currentNumber=num;
                while(numbers.contains(currentNumber+1)){
                    currentSubsequent++;
                    currentNumber++;
                }
                longestSubsequent=Math.max(currentSubsequent, longestSubsequent);
            }
        }

        return longestSubsequent;
        
    }
}
