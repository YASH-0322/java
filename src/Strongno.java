/*     STROMG NUMBER
a no. which no. of factorial sum is equal to itself
example =145
1! +4!+5!=145
 */


import java.util.Scanner;

public class Strongno {
    public static void main(String []args){
        Scanner src=new Scanner(System.in);
        int n = src.nextInt();
        int copy =n;
        int factorial =1;
        int sum =0;
        while(n>0){
            System.out.println(n%10);
            for(int i =1;i<=n%10;i++){
             factorial *=i;


            }
            System.out.println(n%10 +" ka  " +factorial);

          sum +=factorial;

            factorial=1;
            n/=10;
        }

        System.out.println(sum);
        System.out.println(sum==copy? copy+" is a strong no.":copy +" is not a strong no.");

    }
}
