package bitmanip;

import java.util.*;

public class unique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(xor(arr, n));
    }

    public static int xor(int[] arr, int n) {
        int a = 0;
        for (int i = 0; i < n; i++) {
            a ^= arr[i];
        }
        return a;
    }
}
