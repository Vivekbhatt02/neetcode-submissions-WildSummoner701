class Solution {
    /**
     * @param {number[]} nums
     * @return {boolean}
     */
    hasDuplicate(nums) {
        const uniques = new Set();
        for(let item of nums){
            if(!uniques.has(item)){
                uniques.add(item);
            }else{
                return true;
            }
        }

        return false;
    }
}
