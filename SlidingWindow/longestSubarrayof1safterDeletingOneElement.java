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


// 


class Solution {
    public int longestSubarray(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        
        // count consecutive 1's ending at i
        prefix[0] = nums[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = nums[i] == 1 ? prefix[i - 1] + 1 : 0;
        }

        int[] suffix = new int[n];
        // count consecutive 1's starting at i
        suffix[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suffix[i] = nums[i] == 1 ? suffix[i + 1] + 1 : 0;
        }

        int max = 0;
        for (int i = 0; i < n; i++) {
            int left = i > 0 ? prefix[i - 1] : 0;
            int right = i < n - 1 ? suffix[i + 1] : 0;
            max = Math.max(max, left + right);
        }

        return max;
    }
}
