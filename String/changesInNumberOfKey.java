class Solution {
    public int countKeyChanges(String s) {
        int changes = 0;
        s = s.toLowerCase(); 
        
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(i - 1)) {
                changes++;
            }
        }
        
        return changes;
    }
}