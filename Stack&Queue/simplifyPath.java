import java.util.Stack;

public class Solution {
    public static String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] components = path.split("/");

        for (String dir : components) {
            if (dir.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop(); 
                }
            } else if (!dir.isEmpty() && !dir.equals(".")) {
                stack.push(dir);
            }
        }

        StringBuilder result = new StringBuilder();
        for (String dir : stack) {
            result.append("/").append(dir);
        }

        return result.length() > 0 ? result.toString() : "/";
    }
}
