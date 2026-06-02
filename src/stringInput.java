        //STRING IS USE FOR PRINT STRING
import java.util.Scanner;

public class stringInput {
    public static void main(String[] args){
        Scanner src=new Scanner(System.in);
        String name = src.next();
        //next() is only use for take only first letter of string ;
        src.nextLine();//iska use isliye kiya jabham yash chourasiya de ry the to yash to next() s print ho gya
        //par buffer m enter or chourasiya bcha tha .
        String name1=src.nextLine();
        System.out.println(name);
        System.out.println(name1);
    }
}
