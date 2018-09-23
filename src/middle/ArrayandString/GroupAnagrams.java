package Middle.ArrayandString;

import java.util.*;

public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        //字谜分组,字母异位词分组
        //素数方法，根据素数乘积组合唯一
        //定义长度为26的素数数组代表a-z26个字母
        int[] prime = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103};//最多10609个z
        List<List<String>> res = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (String s : strs) {
            int key = 1;
            for (char c : s.toCharArray()) {
                key *= prime[c - 'a'];
            }
            List<String> t;
            if (map.containsKey(key)) {
                t = res.get(map.get(key));
            } else {
                t = new ArrayList<>();
                res.add(t);
                map.put(key, res.size() - 1);
            }
            t.add(s);
        }
        return res;
    }


    public static void main(String[] args) {
        System.out.println(groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
    }
//    //字谜分组,字母异位词分组
//    public static List<List<String>> groupAnagrams(String[] strs) {
//        if (strs.length == 0) return new ArrayList<>();
//        Map<String, List> ans = new HashMap<String, List>();
//        int[] count = new int[26];
//        for (String s : strs) {
//            Arrays.fill(count, 0);//用0填充整个count数组
//            for (char c : s.toCharArray()) {
//                count[c - 'a']++;
//            }
//            StringBuilder sb = new StringBuilder("");
//            for (int i = 0; i < 26; i++) {
//                sb.append('#');
//                sb.append(count[i]);
//            }
//            String key = sb.toString();
//            if(!ans.containsKey(key)){
//                ans.put(key, new ArrayList());
//            }
//            ans.get(key).add(s);
//        }
//        return new ArrayList(ans.values());
//    }
}
