import java.util.*;
public class SecondDigitOfNumber {
 public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    long rem = 0;
    while(n>10){
        rem = n%10;
        n = n/10;
    }
    System.out.println(rem);
 }   
}