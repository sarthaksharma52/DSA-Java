import java.util.Arrays;

class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);                            
        return countAtMost(nums, upper) - countAtMost(nums, lower - 1);        
    }

    private long countAtMost(int[] nums, int X) {
        long cnt = 0;
        int i = 0, j = nums.length - 1;

        while (i < j) {                              
            long sum = (long) nums[i] + nums[j];
            if (sum <= X) {
                cnt += (j - i);
                i++;
            } else {
                j--;
            }
        }

        return cnt;
    }
}
