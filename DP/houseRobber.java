class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp,-1);
        int res = rec(nums,0,dp);
        return res;
    }

    public static int rec(int[] nums,int i,int[] dp){

        if(i>=nums.length){
            return 0;
        }

        if(dp[i]!=-1){
            return dp[i];
        }
        
        int take = nums[i]+rec(nums,i+2,dp);
        int notTake = rec(nums,i+1,dp);

        dp[i] =  Math.max(take,notTake);
        
        return dp[i];
    }
}