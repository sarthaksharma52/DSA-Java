class Solution {
    public int areaOfMaxDiagonal(int[][] dimension) {

        int maxD = 0;
        int diag = 0;
        int index = 0;  
        int area = 0;

        for (int i = 0; i < dimension.length; i++) {
            int l = dimension[i][0];
            int w = dimension[i][1];
            diag = l * l + w * w;
            int currArea = l * w;

            if (diag > maxD) {
                maxD = diag;
                index = i;
                area = currArea;
            } else if (diag == maxD) {
                area = Math.max(area, currArea);
            }
        }

        return area;
    }
}
