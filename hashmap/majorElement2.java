class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int num:nums){
            hm.put(num , hm.getOrDefault(num,0)+1);
        }
        int max = nums.length/3;
        List<Integer> arr = new ArrayList<>();
        for(Map.Entry<Integer,Integer> hm1 : hm.entrySet()){
            int currentFreq = hm1.getValue();
            if(currentFreq>max){
                arr.add(hm1.getKey());
            }
        }
        return arr;
    }
}