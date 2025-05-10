class Solution {
    public long minSum(int[] nums1, int[] nums2) {
        long sum1 = 0, sum2 = 0;
        int zeros1 = 0, zeros2 = 0;
        
        for (int num : nums1) {
            sum1 += num;
            zeros1 += (num == 0) ? 1 : 0;
        }
        
        for (int num : nums2) {
            sum2 += num;
            zeros2 += (num == 0) ? 1 : 0;
        }
        
        long minSum1 = sum1 + zeros1;
        long minSum2 = sum2 + zeros2;
        
        if (zeros1 > 0 && zeros2 > 0) {
            return Math.max(minSum1, minSum2);
        }
        
        if (zeros1 > 0 && zeros2 == 0) {
            return (minSum1 <= sum2) ? sum2 : -1;
        }
        
        if (zeros1 == 0 && zeros2 > 0) {
            return (minSum2 <= sum1) ? sum1 : -1;
        }
        
        return (sum1 == sum2) ? sum1 : -1;
    }
}