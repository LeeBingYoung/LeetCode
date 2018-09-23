package problem;

import java.util.Scanner;

public class Pro1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        System.out.print(hammingWeight(n));
    }
    public static long hammingWeight(long n) {
        long sum = 0;
        while (n != 0) {
            sum++;
            n &= (n - 1);
        }
        return sum;
    }
}
