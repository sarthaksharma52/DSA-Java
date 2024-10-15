class Solution {
    public String freqAlphabets(String s) {
        StringBuilder str = new StringBuilder();
        int i=0;
        while(i<s.length()){
            if(i+2<s.length() && s.charAt(i + 2) == '#'){
                int num = Integer.parseInt(s.substring(i,i+2));
                char c = (char)('j'+(num-10));
                str.append(c);
                i+=3;
            }else{
                int num = s.charAt(i) - '0';
                char c = (char) ('a' + (num - 1));
                str.append(c);
                i++;
            }
        }
        return str.toString();
    }
}