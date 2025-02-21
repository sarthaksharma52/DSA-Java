class Solution {
    public int longestSubarray(int[] nums) {
        int l=0,r=0,max=0,zeroes=0;
        int n=nums.length;
        while(r<n){
            if(nums[r]==0){
                zeroes++;
            }
            while(zeroes>1){
                if(nums[l]==0){
                    zeroes--;
                }
                l++;
            }
            max=Math.max(max,r-l);
            r++;
        }
        return max;
    }
}