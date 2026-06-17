import java.util.Scanner;

public class Reverse2WL {
    public static void main(String []args){
        Scanner src=new Scanner(System.in);
        int n =src.nextInt();
         int reverse =0;
         while(n>0){
             System.out.println(n%10);
             reverse = reverse*10+n%10;
             n/=10;
         }
        System.out.println(reverse);
    }
}
