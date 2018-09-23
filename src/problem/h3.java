package problem;

import java.util.Scanner;

public class h3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        char[] cs = str.toCharArray();
        char[][] ans = new char[100][100];
        for (int i = 0,start = 0; i < cs.length; i++) {
            if(cs[i] > '0' && cs[i] <= '9'){
                StringBuilder res = new StringBuilder("");
                int m = 0;
                int end = i;
                int num = cs[i] - '0';
                for (int k = 0; k < num; k++) {
                    for (int j = start; j < end; j++) {
                        //System.out.print(cs[j]);
                        res.append(cs[j]);
                    }
                }
                ans[num] = res.toString().toCharArray();
                start = i + 1;
                m++;
            }
        }
        for (int i = ans.length-1 ; i >= 0 ; i--) {

            System.out.print(ans[i]);
        }
    }
}
