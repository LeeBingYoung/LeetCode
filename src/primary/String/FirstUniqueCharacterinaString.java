package primary.String;

import java.util.HashSet;
import java.util.Set;

public class FirstUniqueCharacterinaString {
    public int firstUniqChar(String s) {
        //以[字符-‘a']为数组索引
        //获取每个字符的频率。
        //获取频率为1的第一个字符。
        int[] freq = new int[26];
        for(int i = 0; i < s.length(); i++)
            freq[s.charAt(i) - 'a'] ++;
        for(int i = 0; i < s.length(); i++)
            if(freq[s.charAt(i) - 'a'] == 1) return i;
        return -1;

        //index第一次出现和最后一次出现是否一致
//        int result = -1;
//        for(char c = 'a';c<='z';c++){
//            int index = s.indexOf(c);
//            if(index != -1 && index == s.lastIndexOf(c)){
//                result = result != -1 ? Math.min(result, index) : index;
//            }
//        }
//        return result;
    }
}
