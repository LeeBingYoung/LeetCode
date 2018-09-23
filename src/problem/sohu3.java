package problem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class sohu3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String A = in.next();
        String B = in.next();
        char[] ch1 = A.toCharArray();
        char[] ch2 = B.toCharArray();
        ArrayList list1 = new ArrayList<>();
        ArrayList list2 = new ArrayList<>();
        for (int i = 0,temp = 0; i < ch1.length; i++) {
            if (ch1[i] == '.') {
                list1.add(temp);
                temp = 0;
            } else {
                temp *= 10;
                temp += ch1[i] - '0';

            }
        }
        int[] ver1 = new int[Math.max(list1.size(),list2.size())];
        for (int i = 0; i < list1.size(); i++) {
            ver1[i] = (int)list1.get(i);
        }
        for (int i = 0,temp = 0; i < ch2.length; i++) {
            if (ch2[i] == '.') {
                list2.add(temp);
                temp = 0;
            } else {
                temp += ch2[i] - '0';
                temp *= 10;
            }
        }
        int[] ver2 = new int[Math.max(list1.size(),list2.size())];
        for (int i = 0; i < list2.size(); i++) {
            ver2[i] = (int)list2.get(i);
        }
        int i =0;
        for (; i < Math.max(ver1.length, ver2.length); i++) {
            if(ver1[i] < ver2[i]){
                System.out.println(0);
                break;
            }
        }
        if(i == Math.max(ver1.length, ver2.length ) )
        System.out.println(1);
    }
}
