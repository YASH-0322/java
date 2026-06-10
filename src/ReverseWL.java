import java.util.Scanner;

public class ReverseWL {
    public static void main(String[] args){
        Scanner src = new Scanner(System.in);

        int n =src.nextInt();

        while(n>0){ //y condition isliye lgy hai
            System.out.println(n%10);//last value print ho ri hai

            n/=10;//last value delete hote ja rhi h

        }


    }
}
