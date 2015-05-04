import java.util.Scanner;

public class HelloWorld2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int n;
        try {
            n = Integer.parseInt(s);
        } catch (NumberFormatException e) {
            System.out.println("Error");
            return;
        }
        for (int i = 0; i < n; i++) {
            System.out.println("hello world");
        }
    }
}
