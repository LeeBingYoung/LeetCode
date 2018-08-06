package primary.String;

public class ReverseString {
    public String reverseString(String s) {
        if(s == null || s == "") return "";
        char[] cs = s.toCharArray();
        int start = 0, end = cs.length -1;
        while(start < end) {
            char temp = cs[start];
            cs[start] = cs[end];
            cs[end] = temp;
            start++;
            end--;
        }
        return new String(cs);

        //reverse函数

//        StringBuilder sb = new StringBuilder(s);
//        return sb.reverse().toString();
    }
}
