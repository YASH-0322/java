import java.util.Scanner;

public class MirrorRightTri {
    public static void main(String[] args){
        Scanner src=new Scanner(System.in);
        int n =src.nextInt();
        for(int i=1;i<=n;i++){     // FOR    ROWS
            for(int j=1;j<=n-i;j++){        //FOR GEPS
                System.out.print("-");
            }
            for(int k=1;k<=i;k++){  // FOR COLUMN
                System.out.print("*");
            }
            System.out.println("");

        }
    }

}
