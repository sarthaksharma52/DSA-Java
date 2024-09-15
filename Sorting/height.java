class Solution {
    public int heightChecker(int[] heights) {
        int[] old = new int[heights.length];
        int count = 0;
        for(int i=0;i<heights.length;i++){
            old[i] = heights[i];
        }
       for(int i=0;i<heights.length;i++){
        for(int j=i+1;j<heights.length;j++){
            if(heights[i]>heights[j]){
                int temp = heights[i];
                heights[i] = heights[j];
                heights[j] = temp;
            }

        }
       }
        for(int i=0;i<heights.length;i++){
            if(old[i]!=heights[i]){
                count++;
            }
        }
        return count;
    }
}