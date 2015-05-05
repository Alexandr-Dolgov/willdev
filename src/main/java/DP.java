import java.util.Scanner;

public class DP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int a[][] = new int[n][m];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++) {
                a[i][j] = scanner.nextInt();
            }
        }

        int w[][] = new int[n][m];
        w[0][0] = a[0][0];
        for (int j = 1; j < m; j++){
            w[0][j] = w[0][j-1] + a[0][j];
        }
        for (int i = 1; i < n; i++){
            w[i][0] = w[i-1][0] + a[i][0];
        }
        for (int i = 1; i < n; i++){
            for (int j = 1; j < m; j++) {
                w[i][j] = a[i][j] + Math.min(w[i-1][j], w[i][j-1]);
            }
        }
        System.out.println(w[n-1][m-1]);
    }
}
