package problem;


import java.util.Scanner;

public class h2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input1 = in.nextLine();
        String input2 = in.nextLine();
        System.out.println(isAnagram(input1, input2));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() < t.length()) {
            return false;
        }
        int[] table = new int[26];
        for (int i = 0; i < s.length(); i++) {
            table[s.charAt(i) - 'A']++;
        }
        for (int i = 0; i < t.length(); i++) {
            table[t.charAt(i) - 'A']--;
            if (table[t.charAt(i) - 'A'] < 0) {
                return false;
            }
        }
        return true;
    }
}
