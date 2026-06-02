    //SWAP KA MATLB HAI KI "A" ki value ko B m change krna ;


    import java.util.Scanner;

    public class Swap {
    public static void main (String[]args){
        int a,b,c;
        Scanner src=new Scanner(System.in);
        System.out.println("input the value of a ");
         a= src.nextInt();
        System.out.println(a);

       b = src.nextInt();
        System.out.println("input the value of b ");
        System.out.println(b);
      c=a;
      a=b;
      b=c;
        System.out.println("after swap a is : " +a+"   b is : " +b);




    }
}
