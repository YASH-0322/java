
  //

import java.util.Scanner;

public class Switchcase {
    public static  void main(String[] args){
        Scanner src =new Scanner(System.in);
        int  day=src.nextInt() ;
       String dayname ;
//        switch(day){
//
//            case 1  -> dayname="monday";
//
//            case 2 -> dayname="tuesday";
//            case 3  -> dayname="thursDAY";
//            case 4  -> dayname="THURSDAY";
//            case 5  -> dayname="FRIDAY";
//            case 6  -> dayname="SATURDAY";
//            case 7  -> dayname="SUNDAY";
//            default -> {
//                dayname="khch ni hai ";
//                System.out.println (dayname);
//            }
//
//        }
          switch (day){
              case 1: dayname="monday";
              break;
              case 2: dayname="tuesday";
                  break;
              case 3: dayname="wednesday";
                  break;
              case 4: dayname="thursday";
              break;

              case 5: dayname="friday";
                  break;
              case 6: dayname="saturday";
              break;

              case 7: dayname="sunday";
                  break; //DEFAULT KA USE HAM KHI V KR SKTE H
              default: dayname="INVALID DAY  "; // AGR DEFAULT LST M LIKH RY H TO BREAK NHI V LGYNGE TO CHLEGA
              break;

          }
        System.out.println(dayname);
    }
}

