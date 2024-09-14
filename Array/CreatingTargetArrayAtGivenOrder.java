class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];
        List<Integer> arr = new ArrayList<>(); 
        int i = 0;
        for(i = 0;i<nums.length;i++){
            arr.add(index[i],nums[i]);
        }

        for(i=0;i<nums.length;i++){
            target[i] = arr.get(i);
        }

        return target;
    }
}