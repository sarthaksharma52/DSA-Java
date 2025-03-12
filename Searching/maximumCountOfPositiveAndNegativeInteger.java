class Solution {
    public int maximumCount(int[] nums) {
        int cn = 0, cp =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                cn++;
            }
            else if(nums[i]>0){
                cp++;
            }
        }
        return Math.max(cn,cp);
    }
}