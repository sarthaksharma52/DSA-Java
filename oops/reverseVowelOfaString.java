class Solution {
    public String reverseVowels(String s) {
        StringBuilder str = new StringBuilder(s);
        int l=0;
        int r=s.length()-1;
        while(l<r){
            while(l<r && !isVowel(str.charAt(l))){
                l++;
            }
            while(l<r && !isVowel(str.charAt(r))){
                r--;
            }
                char temp = str.charAt(l);
                str.setCharAt(l,str.charAt(r));
                str.setCharAt(r,temp);
                l++;
                r--;
        } 
        return str.toString();
    }

    private boolean isVowel(char ch){
        return "AEIOUaeiou".indexOf(ch) !=-1;
    }
}