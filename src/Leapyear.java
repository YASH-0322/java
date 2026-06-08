import java.util.Scanner;

public class Leapyear {
    public static  void main(String[] args){
        Scanner src = new Scanner(System.in);
        int a=src.nextInt();
        if(a%4==0 && a%100 !=0 ){
            System.out.println(a+ " year is a leap yesr ");
        }
        else{
            System.out.println(a+ " year is not a leap  year ");
        }


    }
}
