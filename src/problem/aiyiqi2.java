package problem;

import java.util.Scanner;

public class aiyiqi2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        int P = in.nextInt();
        int[] shiwu = new int[N];
        for (int i = 0; i < N; i++) {
            shiwu[i] = in.nextInt();
        }
        int[] buy = new int[N];
        int[] eat = new int[N];
        for (int i = 0; i < M; i++) {
            String f = in.next();
            if ("B".equals(f)) {
                int index = in.nextInt() - 1;
                eat[index] += 1;
            } else {
                int index = in.nextInt() - 1;
                buy[index] += 1;
            }
        }
        for (int i = 0; i < N; i++) {
            shiwu[i] += buy[i];
            shiwu[i] -= eat[i];
        }
        //计算排名
        int x = shiwu[P - 1];
        int count = 1;
        //大于x，count+1
        for (int i = 0; i < N; i++) {
            if (shiwu[i] > x) {
                count++;
            }
        }
        System.out.println(count);
    }
}
