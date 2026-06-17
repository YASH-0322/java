import java.util.Scanner;

public class SumWL {
    public static void main(String[] args){
        Scanner src = new Scanner(System.in);
        int n = src.nextInt();
        int sum =0;
        while(n>0){
            int lastdigit=n%10;
            System.out.println(lastdigit);
            sum+=lastdigit;
            n/=10;

        }
        System.out.println("the sum is " +sum);

    }
}
