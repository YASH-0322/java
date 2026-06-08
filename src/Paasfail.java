import java.util.Scanner;

public class Paasfail {
    public static <string> void main(String[] args){
        Scanner src=new Scanner(System.in);

        int marks =src.nextInt();
        if(marks>=33){
            System.out.println(" student is pass");
        }
        else{
            System.out.println(" student is fail " );
        }
    }
}
