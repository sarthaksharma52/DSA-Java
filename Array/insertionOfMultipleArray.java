import java.util.*;

class Solution {
    public List<Integer> intersection(int[][] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums[0]) {
            set.add(num);
        }

        for (int i = 1; i < nums.length; i++) {
            Set<Integer> currentSet = new HashSet<>();
            for (int num : nums[i]) {
                currentSet.add(num);
            }
            set.retainAll(currentSet); 
        }

        List<Integer> result = new ArrayList<>(set);
        Collections.sort(result);
        return result;
    }
}
