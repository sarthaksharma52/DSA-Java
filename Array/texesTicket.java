import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++){
		    int n = sc.nextInt();
		    int ans = second(t,n);
		    System.out.println(ans);
		}

	}
	private static int second(int t , int n){
	    ArrayList<Integer> arr = new ArrayList<>();
	    for(int i=1;i<=n;i++){
	        arr.add(i);
	    }
	    int sec = 0;
	    while(!arr.isEmpty()){
	        sec++;
	        if(arr.get(0)==n || (arr.size()>2 && arr.get(2)==n)){
	            return sec;
	        }else{
	            arr.remove(0);
	            if(arr.size()>1){
	                arr.remove(1);
	            }
	        }
	    }
	    return -1;
	}
}
