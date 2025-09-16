class Solution {
    public List<Integer> replaceNonCoprimes(int[] nums) {
        List<Integer> ans = new ArrayList<>();
    for(int num:nums){
        ans.add(num);
        while(ans.size()>1){
            int a = ans.get(ans.size()-2);
            int b = ans.get(ans.size()-1);
            int y = gcd(a,b);
            if(y == 1){
                break;
            }
            ans.remove(ans.size()-1);
            ans.remove(ans.size()-1);
            ans.add(lcm(a,b));
        }
    }
        return ans;
    }

    private int gcd(int a,int b){
        while(b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }

    private int lcm(int a,int b){
        return (int)((long)a/gcd(a,b)*b);
    }
}