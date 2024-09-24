package Searching;

import java.util.Scanner;

public class linear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the element of array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter your target");
        int target = sc.nextInt();
        System.out.println(search(arr,target));

    }

    public static int search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
