
            //     LOGICAL OPERATOR IS USE IN MULTIPLE CONDITION.

             // (||) OR OPERATOR M KOI AK CONDITION BHI TRUE HO GI TO ANS TRUE
            //is pr first condition hi true ho gi to next condition check ni krte


            //&& OPE. M DONO CONDITION TRUE HONA CHY
            //is pr odno conditon check krte hai ;


public class Logicaloperator {
    public static void main(String[]args){
        System.out.println(10>6||10<9);


        System.out.println(10>6&&10<9);

        int a=19,b=15;

        System.out.println(a++>19 || b++>15);// or mai next value tab read higi jab koi bhi ak true ho
        System.out.println(a+ " " +b) ;

        int c=20,d=45;
        System.out.println(c++>20  && ++d>45);// agar first condition true hogi tabhi "b" ko read krega nhi to exect jo current value h bhi print ho jygi
        System.out.println(c+ "" +d);

        int e=14,f=78;
        System.out.println(e++<=14  && ++f>78);//is pr first condition  true h isliye  secound bhi read krega

        System.out.println(e+ "" +f);

    }
}
