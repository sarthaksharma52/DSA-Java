class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int n = intervals.length;
        int i;
        List<int[]> arr = new ArrayList<>();

        for (i = 0; i < n && intervals[i][1] < newInterval[0]; i++) {
            arr.add(intervals[i]);
        }

        for (; i < n && intervals[i][0] <= newInterval[1]; i++) {
            newInterval[0] = Math.min(intervals[i][0], newInterval[0]);
            newInterval[1] = Math.max(intervals[i][1], newInterval[1]);
        }

        arr.add(newInterval);

        for (; i < n; i++) {
            arr.add(intervals[i]);
        }

        return arr.toArray(new int[arr.size()][]);
    }
}
