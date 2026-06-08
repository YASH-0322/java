import java.util.Scanner;

public class Practise {
    public static void main(String[] args){
//        Scanner src=new Scanner(System.in);
//        String ch = src.nextLine();
//        if(ch.equals("yes")){
//            System.out.println("this is yes window");
//        }
//        else if (ch.equals("no")){
//            System.out.println("this is no window");
//        }
//        else{
//            System.out.println("this is own window");
//        }




// int a=15,b=17;
//        System.out.println( a++ > --b);
//        System.out.println(a+ ""+b);

        Scanner src=new Scanner(System.in);
        int n =src.nextInt();

        if(n%2==0){
            System.out.println("the "+n+ "is even ");
        }
        else
        {
            System.out.println("the "+n+ "is odd ");
        }
    }
}
