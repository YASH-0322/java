  /*NESTED LOOP
  A LOOP inside a one or more loop known as nested loop
   */

  //for square
  //



  //no.of rows denoted by i

  //no. of coumns denoted by j;


  import java.util.Scanner;

  public class Nestedloop {
    public static void main(String []args ){
        Scanner src =new Scanner(System.in);
        int n=src.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println("+");
            for( int j=1;j<=n;j++){
                System.out.print("* ");
                System.out.print(j);
           }
            System.out.println("  ");
              }

    }

}
