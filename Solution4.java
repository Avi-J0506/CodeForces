import java.util.*;

public class Solution4 {
    static final long MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int testCase = 0; testCase < t; testCase++) {
            int l = sc.nextInt(); 
            int r = sc.nextInt(); 
            int k = sc.nextInt(); 

            long count = 0;
            long lowerBound = (long) Math.pow(10, l);
            long upperBound = (long) Math.pow(10, r);

            for (long n = lowerBound; n < upperBound; n++) {
                long kn = k * n;
                long digitSumN = sumOfDigits(n);
                long digitSumKn = sumOfDigits(kn);

                if (digitSumKn == (k * digitSumN) % MOD) {
                    count++;
                }
            }

            System.out.println(count % MOD);
        }

        sc.close();
    }

    static long sumOfDigits(long n) {
        long sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
