class Solution {
    public int differenceOfSum(int[] nums) {
        int sum = 0;
        int digSum = 0;

        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            digSum = digSum + retSum(nums[i]);
        }

        return Math.abs(sum-digSum);
    }

    private int retSum(int val){
        int sum = 0;
        while(val>0){
            sum = sum + val%10;
            val = val/10;
        }

        return sum;
    }
}