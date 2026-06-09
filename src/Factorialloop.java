import java.util.Scanner;

public class Factorialloop {
    public static void main (String[]args){
        Scanner src = new Scanner(System.in);
        int a = src.nextInt();
        int factorial=1;
        for(int i = 1 ;i<=a;i++){
            factorial = factorial*i;
        }
        System.out.println(factorial);
    }
}
