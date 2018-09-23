package primary.String;

public class StringtoIntegeratoi {
    public static void main(String[] args){
        String str = "2147483648";
        StringtoIntegeratoi a = new StringtoIntegeratoi();
        System.out.println(a.myAtoi(str));
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
    }
    public int myAtoi(String str) {
        int index = 0, sign = 1, total = 0;
        if(str.length() == 0) return 0;
        while(index < str.length() && str.charAt(index) == ' ')
            index ++;
        if(index == str.length()) return 0;
        if(str.charAt(index) == '+' || str.charAt(index) == '-'){
            sign = str.charAt(index) == '-' ?  -1 : 1;
            index ++;
        }
        while(index < str.length()) {
            int digit = str.charAt(index) - '0';
            if(digit < 0 || digit > 9) break;
            if(Integer.MAX_VALUE/10 < total || Integer.MAX_VALUE / 10 == total && Integer.MAX_VALUE % 10 < digit)
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            int temp = total;
            total = total * 10 + digit;
            // if(total / 10 != temp){
            //     return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            // }
            index ++;
        }
        return  total*sign;
    }
}
