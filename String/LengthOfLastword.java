class Solution {
    public int lengthOfLastWord(String s) {
       String Str[] = s.split(" ");
       int ans = Str[Str.length-1].length(); 
       return ans;     
    }
    
}
