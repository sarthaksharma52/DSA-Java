class Solution {
    public int majorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;  // Set the new candidate
            }
            count += (num == candidate) ? 1 : -1;  // Adjust the count
        }

        return candidate;
    }
}
