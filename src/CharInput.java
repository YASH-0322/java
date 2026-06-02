import java.util.Scanner;

public class CharInput {
    public static void main(String[] args){

        Scanner src = new Scanner(System.in);
        char b = src.next().charAt(1);
        //CHARAT() is use for string k kisi ak word ko uthane k liye ;
        //NXT() IS USE FOR UTHNEK LIYE ONE WORD ;
        char b2 = src.nextLine().charAt(7);
        System.out.println("charecter: " +b+ "\nindex 7 character:  "   +b2);

    }
}
