class Solution {
    public int minimumOperations(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i:nums){
            list.add(i);
        }
        int count = 0;
        while(!distinct(list)){
            count++;
            for(int i=0;i<3 && !list.isEmpty(); i++){
                list.remove(0);
            }
        }

        return count;

    }

    private static boolean distinct(ArrayList<Integer> arr){
        HashSet<Integer> unique = new HashSet<>();

        for(int i=0;i<arr.size();i++){
            if(!unique.add(arr.get(i))){
                return false;
            }
        }
        return true;
    }
}