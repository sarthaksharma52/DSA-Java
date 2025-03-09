class Solution {
    public int subtractProductAndSum(int n) {
        int num = n, sum = 0, mul = 1;
        while(num!=0){
            mul = mul*(num%10);
            sum = sum+num%10;
            num =num/10;
        }
        System.out.println(mul + " " + sum);
        return mul - sum;
    }
}