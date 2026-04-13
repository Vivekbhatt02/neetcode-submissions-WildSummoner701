class Solution {
    /**
     * @param {number[]} nums
     * @return {number}
     */
    longestConsecutive(nums) {
        if(nums.length<1){
            return 0;
        }
        const numbers= new Set();

        for(let num of nums){
            numbers.add(num);
        }

        let longestSubsequent=1;

        for(let num of nums){
            if(numbers.has(num-1)){
                continue;
            }else{
                let currentNumber=num;
                let currentSubsequent=1;
                while(numbers.has(currentNumber+1)){
                    currentSubsequent++
                    currentNumber++
                }
                longestSubsequent=Math.max(longestSubsequent, currentSubsequent);
            }
        }

        return longestSubsequent;
    }
}
