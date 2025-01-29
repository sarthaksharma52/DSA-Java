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
		
		sc.nextLine();
		
		String toofam = "ADVITIYA";
		
		while (t>0){
		    String S = sc.nextLine();
		    int steps = 0;
		    
		    for(int i=0;i<S.length();i++){
		        
		        
		    
		        char start = S.charAt(i);
		        char target = toofam.charAt(i);
		    
		        if(start == target){
		            steps = steps + 0;
		        }
		    
		        else{
		        
		            int diff = (target - start + 26) % 26;
		            steps += diff;
		            }
		        }
		        t=t-1;
		        
		        System.out.println(steps);
		        
		    }

	    }
}