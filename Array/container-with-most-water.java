class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int i = 0;
        int j = n-1;
        int most = 0;

        while(i < j)
        {
            int area = Math.min(height[i] , height[j]) * (j-i);
            most = Math.max(most , area);

            if(height[i] < height[j])
            {
                i++;
            }
            else
            {
                j--;
            }

        }
        return most;
    }
}