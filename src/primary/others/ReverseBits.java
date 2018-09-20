package primary.others;

public class ReverseBits {
    //反转二进制，把int转成32位二进制后反转
    public int reverseBits(int n) {
        //通过不断右移n，得到n的最右位，塞入res右端，最后不断左移res
        if (n == 0) return 0;
        int res = 0;
        for (int i = 0; i < 32; i++) {
            res <<= 1;;
            if((n & 1) == 1) res++;
            n >>= 1;
        }
        return res;
    }
}
