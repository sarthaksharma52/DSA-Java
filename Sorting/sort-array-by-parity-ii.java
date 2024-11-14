class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n = nums.length;
        int j=0;
        int k=0;
        ArrayList<Integer> odd = new ArrayList<Integer>();
        ArrayList<Integer> even = new ArrayList<Integer>();

        for(int i=0;i<n;i++){
            if(nums[i]%2==0){
                even.add(nums[i]);
            }else{
                odd.add(nums[i]);
            }
        }

        for(int i=0;i<n;i++){
            if(i%2==0){
                nums[i] = even.get(j);
                j++;
            }else{
                nums[i] = odd.get(k);
                k++;
            }
            
        }
        return nums;
    }
}