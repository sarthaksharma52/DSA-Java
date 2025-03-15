import java.util.*;

class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        int n = nums.length;
        if (n == 0) return result;

        int start = nums[0];

        for (int i = 1; i < n; i++) {
            if (nums[i] != nums[i - 1] + 1) {  
                result.add(formatRange(start, nums[i - 1]));
                start = nums[i];  
            }
        }
        result.add(formatRange(start, nums[n - 1]));  
        return result;
    }

    private String formatRange(int start, int end) {
        return (start == end) ? String.valueOf(start) : start + "->" + end;
    }
}