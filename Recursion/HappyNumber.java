class Solution {
    public boolean isHappy(int n) {
        if(n<0){
            return false;
        }else{
            return sort(n);
        }
    }
    public static boolean sort(int n){
        if(n==1){
            return true;
        }
        else if(n==4){
            return false;
        }
         int square=0;
            while(n>0){
                int s=n%10;
                square+=s*s;
                n=n/10;
            }
            return sort(square);
    }
}