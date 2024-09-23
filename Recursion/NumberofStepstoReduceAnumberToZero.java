class Solution {
    public int numberOfSteps(int num) {
        int ans = count(num,0);
        return ans;
    }
    public int count(int num,int count){
        if(num==0){
            return count;
        }
        else if(num%2==0){
            count++;
            return count(num/2,count);
        }
        else{
            count++;
            return count(num-1,count);   
        }
        // return count;
    }
}