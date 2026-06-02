import java.util.Scanner;

public class Practise {
    public static void main(String[] args){
        Scanner src=new Scanner(System.in);
        String ch = src.nextLine();
        if(ch.equals("yes")){
            System.out.println("this is yes window");
        }
        else if (ch.equals("no")){
            System.out.println("this is no window");
        }
        else{
            System.out.println("this is own window");
        }



    }
}
