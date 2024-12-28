class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int Count = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (Count > 0) { 
                    result.append(c);
                }
                Count++;
            } else if (c == ')'){
                Count--;

                if (Count > 0){ 
                    result.append(c);
                }
            }
        }

        return result.toString();
    }
}
