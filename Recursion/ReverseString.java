class Solution {
    public void reverseString(char[] s) {
        swap(s,0,s.length-1);
    }
    public void swap(char[] s, int l,int r){
        char temp;

        if(l>=r){
            return ;
        }
        else if(l<r){
            temp = s[l];
            s[l] = s[r];
            s[r] = temp;
            swap(s,l+1,r-1);
        }
    }
    
}