import java.util.Scanner;

public class printSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the till you add from zero");
        int n = sc.nextInt();
        System.out.println(add(n));
    }

    public static int add(int n) {
        int sum;
        if(n==0){
            return 0;
        }
        else{
            return sum = n + add(n-1);
        }
    }
}