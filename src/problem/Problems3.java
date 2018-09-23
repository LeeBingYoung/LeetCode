package problem;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Problems3 {
    public static void main(String[] args){
        int n, m;
        int Q;
        int[][] q = new int[2000][2];

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0 ; i< n; i++ ) {
            a[i] = sc.nextInt();
        }
        Q = sc.nextInt();
        int minl = Integer.MIN_VALUE;
        int maxr = Integer.MAX_VALUE;
        for(int i = 0 ; i< Q; i++ ) {
            int count = 0;
            int l = sc.nextInt();
            int r = sc.nextInt();
            l--;
            r--;

            if (l < minl && maxr > maxr) {
                System.out.println(m);
            }

            Set<Integer> set = new HashSet<>();

            for (int j = l; j <= r; j++) {

                if (set.contains(a[j])) continue;
                set.add(a[j]);
                count++;


            }
            if (count == m) {
                minl = l;
                maxr = r;
            }
            System.out.println(count);
        }

    }
}
