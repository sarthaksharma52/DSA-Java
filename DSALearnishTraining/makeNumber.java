import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    String s ="";
    
    for(int i=0;i<str.length();i++){
      if(Character.isDigit(str.charAt(i))){
        s = s+ str.charAt(i);
      }
    }
    
    System.out.println(s);

  }
}