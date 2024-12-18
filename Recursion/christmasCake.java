import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int count = 0;
		int ans =  cake(x,0);
		System.out.print(ans);

	}
	private static int cake(int x,int count){
	    if(x==25){
		    return count;
		}else{
		    return cake(x+1,count+1);
		}
	}
}
