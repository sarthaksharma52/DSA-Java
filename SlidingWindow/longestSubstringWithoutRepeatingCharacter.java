class Solution {
    public int lengthOfLongestSubstring(String s) {
        StringBuilder str = new StringBuilder();
        int n = s.length();
        int l=0,r=0,max=0;
        char target;

        while(r<n){
            if(str.indexOf(String.valueOf(s.charAt(r))) == -1){
                str.append(s.charAt(r));
                max=Math.max(max,str.length());
            }
            else{
                target = s.charAt(r);
                while(s.charAt(l)!=target){
                    int index = str.indexOf(String.valueOf(s.charAt(l)));
                    str.deleteCharAt(index);
                    l++;
                }
                l++;
            }
            r++;
        }
        return max;
    }
}