import java.util.Scanner;

public class IFelseCalculator {
    public static void main (String[]args){
        Scanner src = new Scanner(System.in);
        double a = src.nextDouble();
        double b = src.nextDouble();
        char  c=src.next().charAt(0);
        if(c=='*'){
            System.out.println(a*b);
        } else if (c=='/') {
            System.out.println(a/b);

        }else if(c=='-'){
            System.out.println(a-b);
        }else if(c=='+'){
            System.out.println(a+b);
        }else{
            System.out.println("invalid");
        }

    }
}
