import java.util.*;

public class SwapDilemma {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        List<String> results = new ArrayList<>();

        for(int testCase = 0; testCase < t; testCase++){
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];

            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }
            for(int i = 0; i < n; i++){
                b[i] = sc.nextInt();
            }

            Arrays.sort(a);
            Arrays.sort(b);

            if(Arrays.equals(a, b)){
                results.add("YES");
            } else {
                results.add("NO");
            }
        }

        for(String result : results){
            System.out.println(result);
        }
        sc.close();
    }
}
