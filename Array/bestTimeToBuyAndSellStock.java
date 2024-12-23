// less efficient method to solve problem time complexity ----- O(n^2)


class Solution {
    public int maxProfit(int[] prices) {
        int max=0,maxVal=0;
        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
                max = Math.max(prices[j]-prices[i],max);
                maxVal = Math.max(max,maxVal);
            }
        }
        return maxVal;
    }
}



// optimised method to solve problem time complexity O(n)


class Solution {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE;
        int maxVal=0;
        for(int price:prices){
            if(price<min){
                min = price;
            }
            else{
                maxVal = Math.max(maxVal,price-min);
            }
        }
        return maxVal;
    }
}