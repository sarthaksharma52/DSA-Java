class Solution {
    public long maximumMedianSum(int[] nums) {
        int n = nums.length;

        int count = n/3;
        Arrays.sort(nums);
        long sum = 0;
        int i = 2;

        while(count>0){
            sum+=nums[n-i];
            count--;
            i=i+2;
        }

        return sum;
    }
}