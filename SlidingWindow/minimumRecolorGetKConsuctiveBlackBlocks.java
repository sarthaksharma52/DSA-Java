class Solution {
    public int minimumRecolors(String blocks, int k) {
        String str = blocks.substring(0,k);
        int min = Integer.MAX_VALUE;
        int n = blocks.length();
        int count=0;
        for(int i=0;i<k;i++){
            if(str.charAt(i)=='W'){
                count++;
            }
        }
        min = Math.min(min,count);
        int r=k;
        while(r<n){
            if(blocks.charAt(r)=='W'){
                count++;
            }
            if(blocks.charAt(r-k)=='W'){
                count--;
            }
            r++;
            min = Math.min(min,count);
        }
        return min;
    }
}