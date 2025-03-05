// package _java;

import java.util.Scanner;
import java.util.Arrays;

public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many Elements:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("LArgest: " + arr[n-1]);
        System.out.println("Smallest: " + arr[0]);
        sc.close();
    }
}