package primary.others;

public class HammingDistance {
    //汉明距离，二进制位不等的数目
    public int hammingDistance(int x, int y) {
        int res = x ^ y;
        int sum = 0;
        while (res != 0) {
            sum++;
            res &= (res - 1);
        }
        return sum;

        //return Integer.bitCount(x ^ y);
    }
}
