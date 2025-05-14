class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int sum = nums[0] + nums[1] + nums[2];
        for(int i=0;i<nums.length-2;i++){
            int left = i+1;
            int right = nums.length-1;
            while(left<right){
                int cumSum = nums[i]+nums[left]+nums[right];

                if( Math.abs(cumSum-target) < Math.abs(sum-target) ) {
                    sum = cumSum;
                }

                if(cumSum>target) {
                    right--;
                }
                else if(cumSum<target) {
                    left++;
                }
                else {
                    return target;
                }
            }
        }
        return sum;
    }
}