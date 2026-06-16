import java.util.Scanner;

public class VHalfPattern {
    public static void main(String[] args){
        Scanner src=new Scanner(System.in);
        int n= src.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=2;j<=i;j++){
                System.out.print("_");
            }
            for(int k=1;;){
                System.out.print("*");
                break;
            }

            for(int  j=n;j>i;j--){
                System.out.print("_");
            }
            System.out.println("");

        }

    }
}
