import java.util.*;

public class DiverseGame{
    public static int[][] transformMatrix(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        if(n == 1 && m == 1){
            if(matrix[0][0] == 1){
                System.out.println(-1);
                return null;
            }
        }

        for (int i = 0; i < n; i++) {
            int temp = matrix[i][0];
            for (int j = 0; j < m - 1; j++) {
                matrix[i][j] = matrix[i][j + 1];
            }
            matrix[i][m - 1] = temp;
        }

        int[] tempRow = matrix[0];
        for (int i = 0; i < n - 1; i++) {
            matrix[i] = matrix[i + 1];
        }
        matrix[n - 1] = tempRow;

        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        if(matrix == null) return;
        for (int[] row : matrix) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] a = new int[n][m];
            //Taking input matrix a
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    a[i][j] = sc.nextInt();
                }
            }

            int[][] b = transformMatrix(a);

            printMatrix(b);
        }
        sc.close();
    }
}