class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] products = new int[n];
        int[] producte = new int[n];
        int[] res = new int[n];

        products[0] = nums[0]; 
        for(int i=1;i<n;i++){
           products[i] = products[i-1]*nums[i];
        }
        producte[n-1] = nums[n-1];
        for(int i=n-2;i>=0;i--){
           producte[i] = producte[i+1]*nums[i];
        }
        res[0] = producte[1];
        res[n-1] = products[n-2];
        for(int j=1;j<n-1;j++){
            res[j] = products[j-1]*producte[j+1];
        }
        return res;
    }
    
}
