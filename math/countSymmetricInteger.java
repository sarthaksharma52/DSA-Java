class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;
        for(int i=low; i<=high; i++){
            if(find(i)){
                count++;
            }
        }
        return count;
    }

    private static boolean find(int val){
        int len = Integer.toString(val).length();
        int n = len/2;
        if(len%2!=0){
            return false;
        }
        int sumS = 0;
        int sumL = 0;
        int c = len;

        for(int i = len;i>=0;i--){
            if(c > n){
                sumL = sumL + val%10;
                val = val/10;
                c--;
            }
            else{
                sumS += val%10;
                val = val/10;
                c--;
            }
        }

        return sumS == sumL;
    }
}