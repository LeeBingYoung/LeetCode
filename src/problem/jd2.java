package problem;


import java.util.Scanner;

public class jd2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n <= 1) {
            System.out.println(0);;
        }else {
            int cout = 0;
            long[][] p = new long[n][3];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < 3; j++) {
                    p[i][j] = in.nextInt();
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if(p[i][0] < p[j][0] && p[i][1] < p[j][1] && p[i][2] < p[j][2]) {
                        cout++;
                        break;
                    }
                }

            }
            System.out.println(cout);
        }

    }
}
