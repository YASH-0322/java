
     //FOR MAXIMUM IN 3 NUMBERS

     import java.util.Scanner;

     public class Ifelse {
         public static void main(String[] args) {
             Scanner num1 = new Scanner(System.in);
             int num2 = num1.nextInt();
             int num3 = num1.nextInt();
             int num4 = num1.nextInt();

             if (num2 > num3) {
                 if (num2 > num4) {
                     System.out.println(num2 + "this is greter value ");
                 }
             } else if (num3 > num4) {
                 if (num3 > num2) {
                     System.out.println(num3 + "is greater");
                 }

             } else {
                 System.out.println(num4 + "  is greater ");
             }
         }
     }
