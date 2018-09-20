package primary.others;

public class Numberof1Bits {
    //位1的个数
    //按位与  &
    public int hammingWeight(int n) {
        int sum = 0;
        while (n != 0) {
            sum++;
            n &= (n - 1);
        }
        return sum;
    }
}
