class Solution {
    public int[] getNoZeroIntegers(int n) {

        int[] arr = new int[2];

        for(int i=1;i<=n;i++){
            arr[0] = i;
            arr[1] = n-i;
            if(!Integer.toString(Math.abs(i)).contains("0") && !Integer.toString(Math.abs(n-i)).contains("0")){
                return arr;
            }
        }

        return arr;
        
    }
}