class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list1 = new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(check(i)){
                list1.add(i);
            }
        }
        return list1;
    }

    private boolean check(int i){
        int num = i;
        while(i>0){
            int d = i%10;
            if(d==0){
                return false;
            }
            else if(num%d!=0){
                return false;
            }else{
                i=i/10;
            }
        }
        return true;
    }
}