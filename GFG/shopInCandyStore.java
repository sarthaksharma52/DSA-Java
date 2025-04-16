class Solution{
    static ArrayList<Integer> candyStore(int candies[],int N,int K){
        // code here
        Arrays.sort(candies);
        int r = candies.length;
        int n = candies.length;
        int minCost = 0;
        int maxCost = 0;
        for(int i=0;i<r;i++){
            minCost += candies[i];
            r = r - K;
        }
        
        int l = 0;
        for(int i=n-1;i>=l;i--){
            maxCost += candies[i];
            l = l + K;
        }
        
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(minCost);
        arr.add(maxCost);
        
        return arr;
    }
}