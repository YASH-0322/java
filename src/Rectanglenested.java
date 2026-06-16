import java.util.Scanner;

public class Rectanglenested {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        int n = src.nextInt();
        for (int i = 1; i <= n - 2; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }
}