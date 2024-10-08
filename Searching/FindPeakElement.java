class Solution {
    public int findPeakElement(int[] nums) {
        return find(nums);
    }
    private static int find(int[] nums){
            int large = nums[0];
            int index=0;
            for(int i=1;i<nums.length;i++){
                if(large<nums[i]){
                    large = nums[i];
                    index=i;
                }
            }
            return index;
        }
    }