import java.util.Scanner;

public class InvertedrightTri {
    public static void main(String[]args){
        Scanner src=new Scanner(System.in);
        int n =src.nextInt();
        for(int i=n;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");

        }
    }
}
