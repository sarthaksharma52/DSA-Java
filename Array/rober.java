import java.util.*;

public class rober{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the length of array.");

        int n = sc.nextInt();

        System.out.println("Enter value of array.");

        int[] arr = new int[n];

        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        int sum = rec(arr,0);

        System.out.println("Maximum sum of alternative element is " + sum);

    }

    public static int rec(int[] arr,int i){

        if(i>=arr.length){
            return 0;
        }

        int take = arr[i]+rec(arr,i+2);

        int notTake = rec(arr,i+1);

        return Math.max(take,notTake);
    }
}