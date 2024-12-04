class Solution {
    public int minElement(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums[i] = replace(nums[i]);
        }
        Arrays.sort(nums);
        return nums[0];
    }
    private static int replace(int n){
        int sum = 0;
        while(n>0){
            int num = n%10;
            n=n/10;
            sum = sum+num;
        }
        return sum;
    }
}