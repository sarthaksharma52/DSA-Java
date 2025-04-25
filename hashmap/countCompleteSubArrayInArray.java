class Solution {
    public int countCompleteSubarrays(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();

        for(int i=0;i<nums.length;i++){
            hs.add(nums[i]);
        }
        
        int dist = hs.size();

        int count = 0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            HashSet<Integer> hs2 = new HashSet<>();
            for(int j=i;j<n;j++){
                hs2.add(nums[j]);
                if(hs2.size() == dist){
                    count++;
                }
            }
        }
        return count;
    }
}