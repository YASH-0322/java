import java.util.Scanner;

public class NtimePrint {
    public static void main (String[]args){
        Scanner src=new Scanner(System.in);
        int n = src.nextInt();
        int i ;

        //1 TO N TIME PEINT
//        for(i=1;i<=n;i++){
//            System.out.print(i);
//            System.out.println(" hello");
//
//        }


        //N TO  1 TIME PRIINT
        for(i=n;i>=1;i--){
          System.out.print(i);
           System.out.println(" hello");

    }
    }
}
