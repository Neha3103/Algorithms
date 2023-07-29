//NOT DONE
//setting the bit means setting the bit to 1;
// and resetting the bit means seeting of the bit should be equal to 0;
package bitmanip;

import java.util.*;

public class setibit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sibit(n, k - 1);
        // rsibit(n,k);
    }

    public static void sibit(int n, int k) {
        System.out.println(Integer.toBinaryString(n));
        int mask = (1 >> k - 1);
        System.out.println(mask);
        n = n | mask;
        System.out.println(Integer.toBinaryString(n));
    }
}
