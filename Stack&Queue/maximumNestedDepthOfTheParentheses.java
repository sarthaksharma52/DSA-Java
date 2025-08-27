class Solution {
    public int maxDepth(String s) {
        int maxCount = 0;
        int count = 0;

        Stack <Character> st = new Stack<>();

        for (int i=0;i<s.length();i++){

            if(s.charAt(i) == '('){
                st.push(s.charAt(i));
                count++;
                maxCount = Math.max(count,maxCount);
            }
            else if(s.charAt(i) == ')'){
                st.pop();
                count--;
            }
        }

        return maxCount;

    }
}