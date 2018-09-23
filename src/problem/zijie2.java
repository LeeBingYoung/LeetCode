package problem;

import java.util.Scanner;

public class zijie2 {



        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int M = in.nextInt();
            char[][] bumen = new char[M][M];
            for(int i = 0;i<M;i++) {
                for(int j = 0; j<M;j++) {
                    bumen[i][j] = (char)(in.nextInt()+48);
                }
            }
            zijie2 s = new zijie2();

            System.out.println(s.countbumen(bumen));
        }
        private int n;
        private int m;

        public int countbumen(char[][] grid) {
            int count = 0;
            n = grid.length;
            if (n == 0) return 0;
            m = grid[0].length;
            for (int i = 0; i < n; i++){
                for (int j = 0; j < m; j++)
                    if (grid[i][j] == '1') {
                        DFSMarking(grid, i, j);
                        ++count;
                    }
            }
            return count;
        }

        private void DFSMarking(char[][] grid, int i, int j) {
            if (i < 0 || j < 0 || i >= n || j >= m || grid[i][j] != '1') return;
            grid[i][j] = '0';
            DFSMarking(grid, i + 1, j);
            DFSMarking(grid, i - 1, j);
            DFSMarking(grid, i, j + 1);
            DFSMarking(grid, i, j - 1);
        }


}
