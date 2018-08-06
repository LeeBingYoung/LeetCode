package primary.String;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        char[] cs = s.toCharArray();
        int i = 0, j = cs.length -1;
        while(i < j) {
            if(!(cs[i] >= '0' && cs[i] <= '9') && !(cs[i] >= 'a' && cs[i] <= 'z')) {
                i++;
                continue;
            }
            if(!(cs[j] >= '0' && cs[j] <= '9') && !(cs[j] >= 'a' && cs[j] <= 'z')) {
                j--;
                continue;
            }
            if(cs[i] != cs[j]) return false;
            i++;
            j--;
        }
        return true;
    }
}
