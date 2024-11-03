// using recursion

class Solution {
    public void moveZeroes(int[] nums) {
        int l=0;
        int r=l+1;
        find(nums,l,r);
            
    }

    public static void find(int[] nums, int l,int r){
            if(r>=nums.length){
                return;
            }

            if (nums.length == 1) {
                return;
            }

            else if(nums[l]==0 && nums[r]!=0){
                int temp=nums[l];
                nums[l]=nums[r];
                nums[r]=temp;
                l++;
                r++;
                find(nums,l,r);
            }

            else if(nums[l]==0 && nums[r]==0){
                r++;
                find(nums,l,r);
            }

            else if(nums[l]!=0){
                l++;
                r++;
                find(nums,l,r);

            }
        }
    }





// using while loop

class Solution {
    public void moveZeroes(int[] nums) {
        int l=0;
        int r=l+1;
        while(r<nums.length){
            if(nums.length==1){
            }
            else if(nums[l]==0 && nums[r]!=0){
                int temp=nums[l];
                nums[l]=nums[r];
                nums[r]=temp;
                l++;
                r++;
            }
            else if(nums[l]==0 && nums[r]==0){
                r++;
            }
            else if(nums[l]!=0){
                l++;
                r++;
            }
        }
    }
}