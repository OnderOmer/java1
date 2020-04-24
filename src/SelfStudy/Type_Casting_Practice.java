package SelfStudy;

public class Type_Casting_Practice {

    public static void main(String[] args) {
        int i = (int)3.9;
        System.out.println(i);

        // IMLICIT CASTING
        // byte > short > int > long > float > double

        double d1 = 200;
        long l = i;
        System.out.println(d1);

        // EXPLICIT CASTING

        byte b1 = 5;
        short sh1 = 400;
        b1 = (byte)sh1;


        double price = 200.55;
        int iPrice = (int)price;
        System.out.println(iPrice);

        int int1 = (int)(5/2.0);
        System.out.println(int1);


       // String str = "10"; cannot cast cuz its string.
       // int n1= (int)str;



    }
}
