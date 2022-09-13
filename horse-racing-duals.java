import java.util.*;
import java.io.*;
import java.math.*;
import java.util.Arrays;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] tabpi = new int[N];

        System.err.println("N :" + N);

        for (int i = 0; i < N; i++) {
            int pi = in.nextInt();
            tabpi[i] = pi;
        }
        Arrays.sort(tabpi);

        int ecart = Integer.MAX_VALUE;
        int ecartmin = ecart;

        for (int y = 1; y < N; y++) {

            if (tabpi[y] >= tabpi[y - 1]) {
                ecart = tabpi[y] - tabpi[y - 1];
            }
            if (ecartmin > ecart) {
                ecartmin = ecart;
            }
        }

        // for(int = y;y<N)
        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(ecartmin);
    }
}
