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