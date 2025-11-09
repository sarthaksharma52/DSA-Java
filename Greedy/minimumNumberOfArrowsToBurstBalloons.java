package Greedy;

class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,Comparator.comparingDouble(o->o[1]));
        if(points.length == 0) return 0;
        int count = 1;
        int end = points[0][1];
        for(int i=1;i<points.length;i++){
            if(points[i][0]>end){
                count++;
                end = points[i][1];
            }
        }
        return count;
    }
}