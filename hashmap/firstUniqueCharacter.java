import java.util.*;

class Solution {
    public int firstUniqChar(String s) {
        // LinkedHashMap preserves insertion order
        Map<Character, Integer> map = new LinkedHashMap<>();
        
        // Count frequency of each character
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        // Find first character with frequency 1
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        
        return -1; // if no unique character exists
    }
}
