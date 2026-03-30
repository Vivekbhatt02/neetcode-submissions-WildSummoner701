class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        while(left<=right){
            
            int half = (left+right)/2;
            if(nums[half]==target){
                return half;
            }else if(nums[half]<target){
                left=half+1;
            }else{
                right=half-1;
            }
        }
        return -1;
        
    }
}
