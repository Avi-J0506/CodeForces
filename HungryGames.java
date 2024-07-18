import java.util.Scanner;

public class HungryGames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long[] results = new long[t];

        for (int testCase = 0; testCase < t; testCase++) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            long validSubsegments = 0;
            int start = 0;
            long g = 0;

            for (int end = 0; end < n; end++) {
                g += a[end];

                if (g > x) {
                    g = 0;
                    start++;
                }

                validSubsegments += (end - start + 1);
            }

            results[testCase] = validSubsegments;
        }
        
        sc.close();

        for (long result : results) {
            System.out.println(result);
        }
    }
}
