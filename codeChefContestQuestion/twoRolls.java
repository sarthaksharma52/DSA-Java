import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[2];

        for (int j = 0; j < n; j++) {

            for (int i = 0; i < 2; i++) {
                arr[i] = sc.nextInt();
            }

            if (arr[0] + arr[1] + arr[1] + 1 == 50 || arr[0] + arr[1] + arr[1] + 2 == 50
                    || arr[0] + arr[1] + arr[1] + 3 == 50 || arr[0] + arr[1] + arr[1] + 4 == 50
                    || arr[0] + arr[1] + arr[1] + 5 == 50 || arr[0] + arr[1] + 1 + arr[1] + 2 == 50
                    || arr[0] + arr[1] + 1 + arr[1] + 3 == 50 || arr[0] + arr[1] + 1 + arr[1] + 4 == 50
                    || arr[0] + arr[1] + 1 + arr[1] + 5 == 50 || arr[0] + arr[1] + 2 + arr[1] + 3 == 50
                    || arr[0] + arr[1] + 2 + arr[1] + 4 == 50 || arr[0] + arr[1] + 2 + arr[1] + 5 == 50
                    || arr[0] + arr[1] + 3 + arr[1] + 4 == 50 || arr[0] + arr[1] + 3 + arr[1] + 4 == 50
                    || arr[0] + arr[1] + 3 + arr[1] + 5 == 50 || arr[0] + arr[1] + 4 + arr[1] + 5 == 50
                    || arr[0] + arr[1] + arr[1] == 50 || arr[0] + arr[1] + 1 + arr[1] + 1 == 50
                    || arr[0] + arr[1] + 2 + arr[1] + 2 == 50 || arr[0] + arr[1] + 3 + arr[1] + 3 == 50
                    || arr[0] + arr[1] + 4 + arr[1] + 4 == 50 || arr[0] + arr[1] + 5 + arr[1] + 5 == 50) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

    }
}
