class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int[] highest = new int[n+1];
        highest[0] = 0;
        for(int i=1;i<n+1;i++){
            highest[i] = highest[i-1]+gain[i-1];
        }
        Arrays.sort(highest);
        return highest[n];
    }
}