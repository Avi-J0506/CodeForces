import java.util.Scanner;

public class BeautifulArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        StringBuilder[] results = new StringBuilder[t];

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] beautifulArray = generateBeautifulArray(n);
            
            results[i] = new StringBuilder();
            for (int j = 0; j < n; j++) {
                results[i].append(beautifulArray[j]).append(" ");
            }
        }

        for (StringBuilder result : results) {
            System.out.println(result.toString().trim());
        }

        sc.close();
    }

    public static int[] generateBeautifulArray(int n) {
        int[] array = new int[n];
        
        for (int i = 0; i < n; i++) {
            array[i] = (i + 1) * (i + 1);
        }
        
        return array;
    }
}
