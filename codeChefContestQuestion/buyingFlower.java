// brute force approach

// import java.util.*;
// import java.lang.*;
// import java.io.*;

// class Codechef
// {
// 	public static void main (String[] args) throws java.lang.Exception
// 	{
// 		// your code goes here

// 		Scanner sc = new Scanner(System.in);

// 	    int n = sc.nextInt();

// 	    while(n-- > 0){

// 	        int numFlower = sc.nextInt();

// 	        int cost = 0;

// 	        int ans = totalCost(numFlower,cost);

// 	        if(ans == Integer.MAX_VALUE){
// 	            System.out.println(-1);
// 	        }
// 	        else{
// 	            System.out.println(ans);
// 	        }
// 	    }

// 	}

// 	private static int totalCost(int flower,int cost){

// 	    if (flower == 0){
// 	        return cost;
// 	    }

// 	    if (flower<0){
// 	        return Integer.MAX_VALUE;
// 	    }
// 	    int cost2 = totalCost(flower-2,cost+4);
// 	    int cost3 = totalCost(flower-3,cost+5);

// 	    return Math.min(cost2,cost3);
// 	}
// }


// optimised approach

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            System.out.println(minCost(n));
        }
    }

    private static int minCost(int flowers) {
        int ans = Integer.MAX_VALUE;
        for (int j = 0; j <= flowers / 3; j++) {
            int remaining = flowers - (3 * j);
            if (remaining % 2 == 0) {
                int cost = j * 5 + (remaining / 2) * 4;
                ans = Math.min(ans, cost);
            }
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}
