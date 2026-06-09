import java.util.Scanner;

public class Sumloop {
    public static void main(String[] args){
        Scanner src =new Scanner(System.in);
        int n =src.nextInt();
        int sum=0 ;
        for(int i =1;i<=n;i++){
            sum=sum+i;

            System.out.println(sum);

        }
        System.out.println("sum "+sum);


    }

}
