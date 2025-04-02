class Solution {
    public long maximumTripletValue(int[] nums) {
        long ans = Integer.MIN_VALUE;
        int n = nums.length;
        long val = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    val = (long)(nums[i] - nums[j])*nums[k];
                    ans = Math.max(ans,val);
                }
            }
        }
        return ans < 0 ? 0 : ans;
    }
}