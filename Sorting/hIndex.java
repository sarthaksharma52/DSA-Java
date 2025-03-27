class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int[] arr = new int[n];
        Arrays.sort(citations);
        for(int i=0;i<n;i++){
            arr[i] = citations[n-i-1];
        }

        int count = 0;

        for(int i=1;i<=n;i++){
            if(arr[i-1]>=i){
                count++;
            }
            else{
                break;
            }
        }

        return count;
    }
}