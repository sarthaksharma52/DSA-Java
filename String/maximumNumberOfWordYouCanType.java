class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] str = text.split(" ");
        int count = 0;
        for(int i=0;i<str.length;i++){
            for(int j=0;j<brokenLetters.length();j++){
                if(str[i].contains(String.valueOf(brokenLetters.charAt(j)))){
                    count++;
                    break;
                }
            }
        }
        return str.length - count;
    }
}