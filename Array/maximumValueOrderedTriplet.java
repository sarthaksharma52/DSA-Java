// approach using O(n^3) complexity

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


// approach using O(n) complexity


class Solution {
    public long maximumTripletValue(int[] nums) {
        long ans = 0;
        long dif = 0;
        long max = 0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            ans = Math.max(ans,dif*nums[i]);
            dif = Math.max(dif,max-nums[i]);
            max = Math.max(max,nums[i]);
        }
        return ans;
    }
}