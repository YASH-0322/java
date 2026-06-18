public class Mathmethod {
    public static void main(String[] args){
        int a=19,b=18;
        System.out.println(Math.max(a,b));//compare krke max value de deta hai

        System.out.println(Math.min(a,b));//compare krke min value de deta hai

        System.out.println(Math.abs(-7));//- ya + koi v value ko positive kr deta h ; abs =absolute

        System.out.println(Math.floor(7.5));//y kisi v float k kam bali value dega

        System.out.println(Math.ceil(7.8));//y kisi v float k jyada bali value dega

        System.out.println(Math.round(7.3));//y round value matlb sabse pass jo hoga

        System.out.println(Math.pow(2,3));// y power niklta hai jese tha 2 ki power 3

        System.out.println(Math.sqrt(64));//squareroot  niklke deta hai

        System.out.println(Math.cbrt(2));// CUBEroot niklke deta hai


        System.out.println(Math.random());// yeh koi v hme rendome value de deta hai 0.0-0.9 tk k bich mai
        System.out.println(Math.random()*10);//y e krne k bad value bo 0-9 tk k bich m dega
        System.out.println(Math.random()*10+1);//y e krne k bad value bo 0-10 tk k bich m dega
        System.out.println(Math.random()*100);//y e krne k bad value bo 0-99 tk k bich m dega
        System.out.println((int)(Math.random()*100));//using of type casting we made double into int.
    }
}
