class Solution {
    public boolean doesAliceWin(String s) {
        int count = 0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if( c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                count++;
            }
        }
        if(count > 0){
            return true;
        }
        return false;
    }
}