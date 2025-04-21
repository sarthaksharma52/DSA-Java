package Greedy;

import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int s = sc.nextInt();
    int t = sc.nextInt();
    
    int dif = 0;
    int dif2 = 0;
    int min = 0;
    int count = 0;
    
    while(s>0 || t>0){
      min = 0;
      int sr = s%10;
      int tr = t%10;
      
      dif = Math.abs(sr-tr);
      dif2 = Math.abs(10-dif);
      
      min = Math.min(dif,dif2);
      count +=min;
      
      s = s/10;
      t = t/10;
    }
    
    System.out.println(count);
  }
}