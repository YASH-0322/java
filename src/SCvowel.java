import java.util.Scanner;

public class SCvowel {
    public static void main (String[]args){
        Scanner src = new Scanner(System.in);
//      String ab= src.next();
        char ch = src.next().charAt(0);
        switch (ch){
            case 'a','e','i','o','u' -> System.out.println("albphabet "+ch+ "is vowel" );
            default -> System.out.println("albphabet "+ch+ " is not  vowel");

        }
    }
}
