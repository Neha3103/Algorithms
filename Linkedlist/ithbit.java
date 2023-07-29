//left shift
package bitmanip;

import java.util.*;

public class ithbit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(ibit(n, k));
    }

    public static int ibit(int n, int k) {
        if ((1 & (n >> (k - 1))) == 1) {
            return 1;
        } else {
            return 0;
        }
    }
}
