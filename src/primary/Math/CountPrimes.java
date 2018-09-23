package primary.Math;

public class CountPrimes {
    public static void main(String[] args) {
        System.out.println(countPrimes(5));
        System.out.println(Integer.MAX_VALUE+" "+(int)Math.pow(3,19));
        System.out.println(Math.log10(Integer.MAX_VALUE));
    }
    public static int countPrimes(int n) {
        boolean[] notPrime = new boolean[n];
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (notPrime[i] == false) {
                count++;
                for (int j = 2; i * j < n; j++) {
                    notPrime[i * j] = true;
                }
            }
        }

        return count;
    }
}
