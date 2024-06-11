import java.util.*;

public class Solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); 
        
        List<Integer> results = new ArrayList<>();
        
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            
            int optimalX = 2;
            int maxSum = 0;

            for (int x = 2; x <= n; x++) {
                int sum = 0;
                
                for (int k = 1; k * x <= n; k++) {
                    sum += k * x;
                }

                if (sum > maxSum) {
                    maxSum = sum;
                    optimalX = x;
                }
            }

            results.add(optimalX);
        }

        sc.close();

        for (int result : results) {
            System.out.println(result);
        }
    }
}
