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
		    
		    int[] arr = new int[n];
		    
		    for(int j=0;j<n;j++){
		        arr[j] = sc.nextInt();
		    }
		    
		    int sum = 0;
		    boolean fail = false;
		    
		    for(int k=0;k<n;k++){
		        sum += arr[k];
		        double avg = (double)sum/(k+1);
		        
		        if(avg<40){
		            fail = true;
		            break;
		        }
		    }
		    if(fail){
		        System.out.println("No");
		    }
		    else{
		        System.out.println("Yes");
		    }
		}

	}
}
