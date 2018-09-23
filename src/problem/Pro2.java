package problem;

import java.util.Scanner;

public class Pro2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int time = in.nextInt();
        int[][] order = new int[n][3];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < 3; j++) {
                order[i][j] = in.nextInt();
            }
            if(time >= order[i][1] && time <= order[i][2]) {
                System.out.print(order[i][0]);
            }
        }

    }

}
