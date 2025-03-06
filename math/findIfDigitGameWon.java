class Solution {
    public boolean canAliceWin(int[] nums) {
        int ssum = 0,dsum = 0;
       for(int i=0;i<nums.length;i++){
        if(nums[i]<10){
            ssum = ssum + nums[i];
        }else{
            dsum = dsum + nums[i];
        }
       }
       if(ssum != dsum ){
        return true;
       } 
       else{
        return false;
       }
    }
}