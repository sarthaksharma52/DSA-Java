import java.util.*;

public class sumOfArrayElement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the length of array");
        int n = sc.nextInt();
        
        System.out.println("enter the sum you want to find in array");
        int sum = sc.nextInt();

        Listr<Integer> list = new ArrayList<>();

        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int add = 0;

        sum1(arr,list,add);

        System.out.println("element are :");
        for(int elm: list){
            System.out.println(elm);
        }

    }

    public static void sum1(int[] arr,List<Integer> list,int add){
        if(add == sum){
            return;
        }
        
    }
}
