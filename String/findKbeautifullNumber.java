class Solution {
    public int divisorSubstrings(int num, int k) {
       String str = Integer.toString(num); 
       int count=0;
       for(int i=0;i<=str.length()-k;i++){
        int n = Integer.parseInt(str.substring(i,k+i));
        if(n==0){
        }
        else if(num%n==0){
            count++;
        }
       }
       return count;
    }
}