class Solution {
    public int maxArea(int[] heights) {
        int max=0;
        int left=0, right=heights.length-1;
        while(left<right){
            max=Math.max(max, Math.min(heights[left], heights[right])*(right-left));
            if(heights[right]>heights[left]){
                left++;
            }else{
                right--;
            }
        }
        return max;
    }
}
