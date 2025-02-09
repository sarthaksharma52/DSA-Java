import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();
    String[] str = sc.nextLine().split(" ");
    for(String strs : str){
      System.out.println(processString(strs));
    }
  }
  public static String processString(String strs){
    String[] store = strs.split(":");
    int num = Integer.parseInt(store[1]);
    int sum = 0;
    if(num<0){
      return "-1";
    }
    else{
      while(num!=0){
        int digit = num%10;
        num = num/10;
        sum = sum + digit*digit;
      }
      if(sum%2==0){
        return right(store[0],1);
      }
      else{
        return left(store[0],2);
      }
    }
   }
    private static String right(String stri, int index){
      int len = stri.length();
      index = index%len;
      return stri.substring(len-index)+stri.substring(0,len-index);
    }
    
    private static String left(String stri, int index){
      return stri.substring(index)+stri.substring(0,index);
    }
}