class Solution {
    public int findLHS(int[] nums) {
        if (nums.length == 0) return 0;

        Arrays.sort(nums);

        int prevCount = 0;
        int currCount = 1;
        int maxLen = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                currCount++;
            } 
            else if (nums[i] == nums[i - 1] + 1) {
                prevCount = currCount;
                currCount = 1;
            } 
            else {
                prevCount = 0;
                currCount = 1;
            }

            if (prevCount > 0) {
                maxLen = Math.max(maxLen, prevCount + currCount);
            }
        }

        return maxLen;
    }
}
