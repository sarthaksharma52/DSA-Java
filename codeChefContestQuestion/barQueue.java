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
		
		for(int j=0;j<t;j++){
		    
		    int n = sc.nextInt();
		    sc.nextLine();
		    String s = sc.nextLine();
		  //  System.out.println(s);
		    int len = s.length();
		    int cb = 0,cg = 0, count = 0;
		    Boolean flag = false;
		    
		    for(int i=0;i<len;i++){
		        if(s.charAt(i) == 'G'){
		            cg++;
		        }
		        else{
		            cb++;
		        }
		        
		        count++;
		        if(cb>(2*cg)){
		            System.out.println(count);
		            flag = true;
		            break;
		        }
		    }
		    if(!flag){
                System.out.println(count);
		    }
		}
	}
}
