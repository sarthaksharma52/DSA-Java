class Solution {
    public int findElement(int[] arr) {
        // code here
        
        int n=arr.length;
        int i=1,j=n-2;
        
        while(i<=j){
            if(arr[i]<arr[i-1]){
                i++;
            }
            else if(arr[j]<arr[j-1]){
                j--;
            }
            else break;
        }
        if(i==j) return arr[i];
       
        return -1;
        
    }
}