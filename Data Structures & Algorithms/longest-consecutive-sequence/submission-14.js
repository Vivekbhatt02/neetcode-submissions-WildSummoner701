class Solution {
    /**
     * @param {number[]} nums
     * @return {number}
     */
    longestConsecutive(nums) {
        if(nums.length===0){
            return 0;
        }

        const set = new Set();
        for(let num of nums){
            set.add(num);
        }

        let longestConsecutiveSequence=1;

        for(let num of nums){
            if(set.has(num-1)){
                continue;
            }else{
                let currentSequence=1;
                let currentValue=num;
                while(set.has(currentValue+1)){
                    currentSequence++;
                    currentValue++;
                }

                longestConsecutiveSequence = Math.max(longestConsecutiveSequence, currentSequence);
            }
        }

        return longestConsecutiveSequence;
    }
}
