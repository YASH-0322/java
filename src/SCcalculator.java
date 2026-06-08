import java.util.Scanner;

public class SCcalculator {
    public static void main(String[] args){
        Scanner src = new Scanner(System.in);
      double  a =src.nextDouble();
     double b =src.nextDouble();
      char c=src.next().charAt(0);
     switch(c){
         case '*' -> System.out.println(a*b);
         case '/' -> System.out.println(a/b);
         case '+' -> System.out.println(a+b);
         case '-' -> System.out.println(a-b);
         default -> System.out.println("invalid operator");
     }



    }
}
