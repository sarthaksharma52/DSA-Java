package Greedy;

import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int[] arrival = new int[n];
    for (int i = 0; i < n; i++) {
      arrival[i] = sc.nextInt();
    }

    int[] depart = new int[n];
    for (int i = 0; i < n; i++) {
      depart[i] = sc.nextInt();
    }

    Arrays.sort(arrival);
    Arrays.sort(depart);

    int platforms = 1, maxPlatforms = 1;
    int i = 1, j = 0;

    while (i < n && j < n) {
      if (arrival[i] <= depart[j]) {
        platforms++;
        i++;
      } else {
        platforms--;
        j++;
      }
      maxPlatforms = Math.max(maxPlatforms, platforms);
    }

    System.out.println(maxPlatforms);
  }
}
