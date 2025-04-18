package TwoPointer;

class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k=k%n;
        int l=0,r=n-1;
        ans(nums,0,n-1);
        ans(nums,0,k-1);
        ans(nums,k,n-1);
        return;
    }

    private void ans(int[] nums, int l ,int r){
        while(l<r){
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;
            r--;
        }
    }
}
