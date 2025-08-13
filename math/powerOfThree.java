// class Solution {
//     public boolean isPowerOfThree(int n) {
//         if(n<=0) return false;
//         for(int i=0;i<31;i++){
//             int s = (int)Math.pow(3,i);
//             if(s==n){
//                 return true;
//             }
//             if(s>n){
//                 break;
//             }
//         }
//         return false;
//     }
// }



class Solution {
    public boolean isPowerOfThree(int n) {
        if (n <= 0) return false;
        while (n % 3 == 0) {
            n /= 3;
        }
        return n == 1;
    }
}
