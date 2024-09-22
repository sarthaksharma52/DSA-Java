class Solution {
    public int search(int[] nums, int target) {
        
        return find(nums,0,nums.length-1,target);
        
    }
    public int find(int[] nums, int s,int e,int target){
        
            int m=s+(e-s)/2;

            if(s>e){
                return -1;
            }
            if(nums[m]==target){
                return m;
            }
            else if(target<nums[m]){
                e=m-1;
                return find(nums,s,e,target);
            }
            else{
                s=m+1;
                return find(nums,s,e,target);
            }
        

        }
}