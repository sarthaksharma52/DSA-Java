class Solution {
    public int countDigits(int num) {
        int count = 0;
        int c = num;
        while(num!=0){
            int n = num%10;
            num = num/10;
            if(c%n==0){
                count++;
            }
        }
        return count;
    }
}