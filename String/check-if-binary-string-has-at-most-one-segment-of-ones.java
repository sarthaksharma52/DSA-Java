class Solution {
    public boolean checkOnesSegment(String s) {
        StringBuilder str = new StringBuilder(s);
        int count=0;
        for(int i=1;i<str.length();i++){
            if(str.charAt(i-1)!=str.charAt(i)){
                count++;
            }
        }
        if(count>1){
            return false;
        }else{
            return true;
        }
    }
}