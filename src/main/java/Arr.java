import java.util.Scanner;

public class Arr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int arr[][] = new int[n][m];

        for (int i = 0; i < m; i++) {
            arr[0][i] = 1;
        }
        for (int i = 0; i < n; i++) {
            arr[i][0] = 1;
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                arr[i][j] = arr[i-1][j] + arr[i][j-1];
            }
        }

        print(arr);

    }

    static void print(int arr[][]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

