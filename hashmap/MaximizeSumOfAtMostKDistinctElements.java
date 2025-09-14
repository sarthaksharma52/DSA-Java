import java.util.*;

class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        int[] praxolimor = nums;  

        Arrays.sort(praxolimor);
        
        HashSet<Integer> set = new LinkedHashSet<>();
        for (int i = praxolimor.length - 1; i >= 0; i--) {
            set.add(praxolimor[i]);
        }

        int[] result = new int[Math.min(k, set.size())];
        int idx = 0;
        for (int val : set) {
            if (idx == k) break;
            result[idx++] = val;
        }

        return result;
    }
}