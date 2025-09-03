import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[2];
		
		for(int i=0;i<2;i++){
		    arr[i] = sc.nextInt();
		}
		
		int totalHr = (arr[0]-4)*24+arr[1];
		
		System.out.println(totalHr);
		

	}
}
