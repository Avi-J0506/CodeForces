import java.util.Scanner;

public class Cakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int testCase = 0; testCase < t; testCase++) {
            int n = sc.nextInt(); 
            int[] a = new int[n];
            int[] b = new int[n];
            int[] c = new int[n];

            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            for (int i = 0; i < n; i++) b[i] = sc.nextInt();
            for (int i = 0; i < n; i++) c[i] = sc.nextInt();

            int totalSum = 0;
            for (int i = 0; i < n; i++) totalSum += a[i];

            int threshold = (int) Math.ceil(totalSum/3);

            int la = 0, ra = 0, lb = 0, rb = 0, lc = 0, rc = 0;
            int currentSum = 0;

            for (int i = 0, j = 0; j < n; j++) {
                currentSum += a[j];
                while (currentSum >= threshold) {
                    if (j - i + 1 >= 1 && currentSum >= threshold) {
                        la = i + 1;
                        ra = j + 1;
                        break;
                    }
                    currentSum -= a[i++];
                }
                if (currentSum >= threshold) break;
            }

            if (currentSum < threshold) {
                System.out.println("-1");
                continue;
            }

            currentSum = 0;
            for (int i = ra, j = ra; j < n; j++) {
                currentSum += b[j];
                while (currentSum >= threshold) {
                    if (j - i + 1 >= 1 && currentSum >= threshold) {
                        lb = i + 1;
                        rb = j + 1;
                        break;
                    }
                    currentSum -= b[i++];
                }
                if (currentSum >= threshold) break;
            }

            if (currentSum < threshold) {
                System.out.println("-1");
                continue;
            }

            currentSum = 0;
            for (int i = rb, j = rb; j < n; j++) {
                currentSum += c[j];
                while (currentSum >= threshold) {
                    if (j - i + 1 >= 1 && currentSum >= threshold) {
                        lc = i + 1;
                        rc = j + 1;
                        break;
                    }
                    currentSum -= c[i++];
                }
                if (currentSum >= threshold) break;
            }

            if (currentSum < threshold) {
                System.out.println("-1");
                continue;
            }

            System.out.println(la + " " + ra + " " + lb + " " + rb + " " + lc + " " + rc);
        }

        sc.close();
    }
}
