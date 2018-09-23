package problem;

import java.io.BufferedInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class jd1 {
    public static int[] color = new int[1001];
    public static int V, E;
    public static List<Integer>[] list;

    public static void main(String[] args) {
        Scanner cin = new Scanner(new BufferedInputStream(System.in));
        int n = cin.nextInt();
        while(n > 0) {
            V = cin.nextInt();
            E = cin.nextInt();
            list = (ArrayList<Integer>[]) new ArrayList[V]; // 为了创建邻接链表，每个链表装着该顶点相邻的顶点
            for (int i = 0; i < V; ++i) { // 这一步容易忘，不然空指
                list[i] = new ArrayList<Integer>();
            }
            for (int i = 0; i < V; ++i) {
                int a = cin.nextInt();
                int b = cin.nextInt();
                list[a].add(b);
                list[b].add(a);
            }
            //cin.close();
            solve();
            n--;
        }
    }

    // 把顶点染成1或-1
    public static boolean dfs(int v, int c) {
        color[v] = c; // 把顶点v染成颜色c
        int size = list[v].size();
        for (int i = 0; i < size; ++i) {
            int e = list[v].get(i);
            if (color[e] == c) return false; // 如果相邻的顶点同色，则返回false
            if (color[e] == 0 && !dfs(e, -c))   return false; // 如果相邻的顶点还没被染色，则染成-c试试
        }
        // 如果所有顶点都染过色了，则返回true
        return true;
    }

    public static void solve() {
        for (int i = 0; i < V; ++i) {
            if (color[i] == 0) { // 该顶点还没有被染色
                if (!dfs(i, 1)) {
                    System.out.println("NO");
                    return;
                }
            }
        }
        System.out.println("YES");
    }
}


