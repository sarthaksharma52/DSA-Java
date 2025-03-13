class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l = 0, r = 0;
        int sum = 0 , count = 0;
        int min = Integer.MAX_VALUE;
        while(r<nums.length){
            sum = sum + nums[r];
            while(sum>=target){
                min = Math.min(min,r-l+1);
                sum = sum - nums[l];
                l++;
            }
            r++;
        }
        return (min == Integer.MAX_VALUE)? 0:min;
    }
}