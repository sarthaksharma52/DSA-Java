public class RotateString {
    public static boolean rotateString(String s, String goal) {
        // Check if lengths are different
        if (s.length() != goal.length()) {
            return false;
        }
        // Check if goal is a substring of s + s
        String concatenated = s + s;
        return concatenated.contains(goal);
    }



// /////////////////////////////////////////////  //

class Solution {
    public boolean rotateString(String s, String goal) {
        int len = s.length();
        
        if (s.length() != goal.length()) {
            return false;
        }

        for (int i = 0; i < len; i++) {
            String rotated = s.substring(i) + s.substring(0, i);
            if (goal.equals(rotated)) {
                return true;
            }
        }
        
        return false;
    }
}
