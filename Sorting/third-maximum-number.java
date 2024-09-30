class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        
        ArrayList<Integer> distinctNums = new ArrayList<>();
        
        for (int i = 0; i < nums.length; i++) {
            if (distinctNums.isEmpty() || nums[i] != distinctNums.get(distinctNums.size() - 1)) {
                distinctNums.add(nums[i]);
            }
        }

        if (distinctNums.size() < 3) {
            return distinctNums.get(distinctNums.size() - 1);
        }

        return distinctNums.get(distinctNums.size() - 3);
    }
}