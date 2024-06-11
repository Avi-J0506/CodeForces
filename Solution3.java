import java.util.*;

public class Solution3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int testCase = 0; testCase < t; testCase++) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int count = 0;
            int sum = 0;
            int[] check = new int[n];
            for(int i = 0; i < n; i++){
                if(arr[i] == 0) count++;
                check[i] = arr[i];
                Arrays.sort(check);
                for(int j = 0; j < n-1; j++){

                }
            }
        }
        sc.close();
    }
}
