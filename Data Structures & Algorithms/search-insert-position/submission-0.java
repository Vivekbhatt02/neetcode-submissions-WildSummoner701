class Solution {
    public int searchInsert(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int half=(start+end)/2;
            if(nums[half]==target){
                return half;
            }else if(nums[half]<target){
                start=half+1;
            }else{
                end=half-1;
            }
        }
        
        return start;
        
    }
}