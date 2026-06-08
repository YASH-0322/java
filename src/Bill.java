import java.util.Scanner;

public class Bill {
    public static void main(String[] args){
        Scanner src = new Scanner(System.in);
        int amount = src.nextInt();
      int   discount = 0 ;// starting pr hmko discount 0 manna padega
        if(amount>0 &&amount<=5000){
            discount = 0 ;
        }
        else if (amount>=5001&&amount<7001){
            discount = 5 ;
        }else if(amount>=7001 && amount<9001 ){
            discount = 10;
        }else if(amount>=9001)
        {
            discount = 15;
        }else{
            System.out.println("invalid amount ");
        }
        System.out.println(discount);
        System.out.println( amount*discount/100);
        System.out.println("final aamount  " +(amount- amount*discount/100));
    }
}
