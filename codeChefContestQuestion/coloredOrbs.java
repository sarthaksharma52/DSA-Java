import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		
		int arr1 = sc.nextInt();
	    int arr2 = sc.nextInt();
		
        int max = Math.min(arr1,arr2);
        
        int skill = (arr1 - max) * 1 + (arr2 - max) * 2 + max * 5;
	    
        System.out.println(skill);
	}
}
