import java.util.Scanner;

public class Input {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);



//        System.out.println("enter the input ");
//        int b= sc.nextInt();
//
//        System.out.println("THE INPUT IS "+b);

        //ADDITION
        System.out.println("plese input first \n secound value  ");
        System.out.print("ener the first value  ");
        int a = sc.nextInt();

//\n is used for next line
        System.out.println("ener the secound  value  ");
        int b = sc.nextInt();

        System.out.println("addition of input a & b is "+(a+b));
    }
}
