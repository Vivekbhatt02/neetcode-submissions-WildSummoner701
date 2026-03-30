class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = findBound(nums, target, true);

        if (first == -1) {
            return new int[]{-1, -1};
        }

        int last = findBound(nums, target, false);

        return new int[]{first, last};
    }

    private int findBound(int[] nums, int target, boolean isFirst) {
        int start = 0;
        int end = nums.length - 1;
        int bound = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                bound = mid;
                if (isFirst) {
                    end = mid - 1;   // keep searching left
                } else {
                    start = mid + 1; // keep searching right
                }
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return bound;
    }
}